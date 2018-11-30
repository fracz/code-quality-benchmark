// original filename: 00005910.txt
// after
public class Class00000241Better {
    public void scheduleArtifactsDownloading(final List<MavenProject> projects) {
        runWhenFullyOpen(new Runnable() {

            public void run() {
                for (MavenProject each : projects) {
                    myArtifactsDownloadingProcessor.scheduleTask(new MavenProjectsProcessorArtifactsDownloadingTask(each, myProjectsTree));
                }
            }
        });
    }
}
