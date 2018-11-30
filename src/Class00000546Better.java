// original filename: 00003221.txt
// before
public class Class00000546Better {
    public static AssertHint createAssertEqualsHint(PsiMethodCallExpression expression) {
        return create(expression, methodName -> "assertEquals".equals(methodName), 2);
    }
}
