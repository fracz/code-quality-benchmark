// original filename: 00005910.txt
// before
public class Class00000241Worse {
    public void scheduleArtifactsDownloading() {
        runWhenFullyOpen(new Runnable() {

            public void run() {
                for (MavenProject each : getProjects()) {
                    myArtifactsDownloadingProcessor.scheduleTask(new MavenProjectsProcessorArtifactsDownloadingTask(each, myProjectsTree, getDownloadingSettings()));
                }
            }
        });
    }
}
