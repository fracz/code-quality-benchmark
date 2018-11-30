// original filename: 00009120.txt
// after
public class Class00000176Better {
    private static boolean isNullLiteralExpression(PsiElement expr) {
        return expr instanceof PsiExpression && ExpressionUtils.isNullLiteral((PsiExpression) expr);
    }
}
