<?php


for ($i = 0; $i < 10; $i++) {

    foreach (['Worse', 'Better'] as $suffix) {
        $output = [];

        $fileNumber = sprintf('%08d', $i);
        $filename = $fileNumber . $suffix;
        exec("java -jar checkstyle-8.12-all.jar -c sun_checks_scqm.xml  ../../src/Class$filename.java", $output);

        if (count($output) > 2) {
            $output = array_slice($output, 1, count($output) - 3);
            var_dump($filename, $output);
        }
    }
}
