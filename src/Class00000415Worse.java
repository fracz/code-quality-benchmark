// original filename: 00008841.txt
// before
public class Class00000415Worse {
    @Override
    protected boolean checkEnabled(Project project, Editor editor, PsiElement element1, String dialogTitle) {
        if (PyUtil.getContainingClassOrSelf(element1) == null) {
            CommonRefactoringUtil.showErrorHint(project, editor, "Cannot introduce field: not in class", dialogTitle, "refactoring.extractMethod");
            return false;
        }
        return true;
    }
}
