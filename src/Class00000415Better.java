// original filename: 00008841.txt
// after
public class Class00000415Better {
    @Override
    protected boolean checkEnabled(IntroduceOperation operation) {
        if (PyUtil.getContainingClassOrSelf(operation.getElement()) == null) {
            CommonRefactoringUtil.showErrorHint(operation.getProject(), operation.getEditor(), "Cannot introduce field: not in class", myDialogTitle, getHelpId());
            return false;
        }
        return true;
    }
}
