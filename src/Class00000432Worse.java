// original filename: 00012741.txt
// before
public class Class00000432Worse {
    @Override
    public void show() {
        DumbService.allowStartingDumbModeInside(DumbModePermission.MAY_START_MODAL, new Runnable() {

            @Override
            public void run() {
                RefactoringDialog.super.show();
            }
        });
    }
}
