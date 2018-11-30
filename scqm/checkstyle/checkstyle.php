<?php


$dataLabels = ['Checkstyle', 'Cyclomatic complexity', 'NCSS', 'NPath', 'Boolean expression complexity', 'aSCQM'];
$allDataLabels = [];
foreach ($dataLabels as $dataLabel) {
    $allDataLabels[] = $dataLabel . ' - Worse';
}
foreach ($dataLabels as $dataLabel) {
    $allDataLabels[] = $dataLabel . ' - Better';
}

$allDataLabels[] = 'rSCQM';

echo implode("\t", $allDataLabels) . PHP_EOL;

for ($i = 0; $i < 645; $i++) {

    $dataRow = [];
    $sources = [];

    foreach (['Worse', 'Better'] as $suffix) {
        $output = [];

        $fileNumber = sprintf('%08d', $i);
        $filename = $fileNumber . $suffix;
        exec("java -jar checkstyle-8.12-all.jar -c sun_checks_scqm.xml  ../../src/Class$filename.java", $output);

        $output = array_slice($output, 1, count($output) - 3);

        $cyclomaticComplexity = 0;
        $ncss = 0;
        $npath = 0;
        $booleanExp = 0;

        $output = array_filter($output, function ($error) use (&$booleanExp, &$npath, &$ncss, &$cyclomaticComplexity) {
            if (preg_match('#Cyclomatic Complexity is (\d+)#', $error, $match)) {
                $cyclomaticComplexity += $match[1];
            } elseif (preg_match('#NCSS for this method is (\d+)#', $error, $match)) {
                $ncss += $match[1];
            } elseif (preg_match('#NPath Complexity is (\d+)#', $error, $match)) {
                $npath += $match[1];
            } elseif (preg_match('#Boolean expression complexity is (\d+)#', $error, $match)) {
                $booleanExp += $match[1];
            }
            return !$match;
        });

        $dataRow[] = count($output);
        $dataRow[] = $cyclomaticComplexity;
        $dataRow[] = $ncss;
        $dataRow[] = $npath;
        $dataRow[] = $booleanExp;

        $source = file_get_contents(__DIR__ . "/../../src/Class$filename.java");
        $ascqm = getScqm('ascqm', ['source' => $source]);
        $ascqm = current($ascqm);
        $ascqm = round($ascqm['prediction'][0] * 100);
        $dataRow[] = $ascqm;
        $sources[] = $source;
    }

    $rscqm = getScqm('rscqm', ['sourceBefore' => $sources[0], 'sourceAfter' => $sources[1]]);
    $rscqm = current($rscqm['predictions']);
    $rscqm = round($rscqm['prediction'][0] * 100);
    $dataRow[] = $rscqm;

    echo implode("\t", $dataRow) . PHP_EOL;
}

function getScqm($scqm, $data) {
    $dataString = json_encode($data);
    $ch = curl_init('http://localhost:7276/' . $scqm);
    curl_setopt($ch, CURLOPT_CUSTOMREQUEST, "POST");
    curl_setopt($ch, CURLOPT_POSTFIELDS, $dataString);
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
    curl_setopt($ch, CURLOPT_HTTPHEADER, array(
            'Content-Type: application/json',
            'Content-Length: ' . strlen($dataString))
    );
    $result = curl_exec($ch);
    return json_decode($result, true);
}
