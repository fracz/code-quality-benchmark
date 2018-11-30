// original filename: 00009422.txt
// after
public class Class00000347Better {
    public void invoke(@NotNull Project project, Editor editor, PsiFile file, DataContext dataContext) {
        performAction(new IntroduceOperation(project, editor, file, null, false, true, isTestClass(file, editor)));
    }
}
