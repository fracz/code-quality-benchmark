// original filename: 00009804.txt
// before
public class Class00000460Worse {
    @Nullable
    private static MavenProjectsNavigator getNavigator(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
        return project == null ? null : MavenProjectsNavigator.getInstance(project);
    }
}
