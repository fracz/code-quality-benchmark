// original filename: 00013167.txt
// before
public class Class00000152Worse {
    @Override
    public void update(final AnActionEvent e) {
        super.update(e);
        final Presentation presentation = e.getPresentation();
        presentation.setText(ProjectBundle.message(myEditTestSources ? "module.toggle.test.sources.action" : "module.toggle.sources.action"));
    }
}
