// original filename: 00009120.txt
// before
public class Class00000176Worse {
    private static boolean isNullLiteralExpression(PsiElement expr) {
        if (expr instanceof PsiLiteralExpression) {
            final PsiLiteralExpression literalExpression = (PsiLiteralExpression) expr;
            return PsiType.NULL.equals(literalExpression.getType());
        }
        return false;
    }
}
