// original filename: 00003221.txt
// after
public class Class00000546Worse {
    public static AssertHint createAssertEqualsHint(PsiMethodCallExpression expression, boolean checkTestNG) {
        return create(expression, methodName -> "assertEquals".equals(methodName) ? 2 : null, checkTestNG);
    }
}
