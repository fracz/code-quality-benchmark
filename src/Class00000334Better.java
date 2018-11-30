// original filename: 00005911.txt
// after
public class Class00000334Better {
    public void scheduleFoldersResolving(final List<MavenProject> projects) {
        runWhenFullyOpen(new Runnable() {

            public void run() {
                for (MavenProject each : projects) {
                    myFoldersResolvingProcessor.scheduleTask(new MavenProjectsProcessorFoldersResolvingTask(each, getImportingSettings(), myProjectsTree));
                }
            }
        });
    }
}
