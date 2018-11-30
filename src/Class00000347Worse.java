// original filename: 00009422.txt
// before
public class Class00000347Worse {
    public void invoke(@NotNull Project project, Editor editor, PsiFile file, DataContext dataContext) {
        performAction(project, editor, file, null, InitPlace.SAME_METHOD, false, true, isTestClass(file, editor));
    }
}
