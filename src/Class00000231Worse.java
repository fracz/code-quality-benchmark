// original filename: 00006144.txt
// before
public class Class00000231Worse {
    @Override
    public void initComponent() {
        if (ApplicationManager.getApplication().isUnitTestMode())
            return;
        if (ApplicationManager.getApplication().isHeadlessEnvironment())
            return;
        if (myProject.isDefault())
            return;
        doInit();
    }
}
