// original filename: 00005911.txt
// before
public class Class00000334Worse {
    public void scheduleFoldersResolving() {
        runWhenFullyOpen(new Runnable() {

            public void run() {
                for (MavenProject each : getProjects()) {
                    myFoldersResolvingProcessor.scheduleTask(new MavenProjectsProcessorFoldersResolvingTask(each, getImportingSettings(), myProjectsTree));
                }
            }
        });
    }
}
