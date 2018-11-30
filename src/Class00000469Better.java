// original filename: 00014591.txt
// before
public class Class00000469Better {
    public String buildErrorString(PsiElement location) {
        final PsiConditionalExpression exp = (PsiConditionalExpression) location;
        return InspectionGadgetsBundle.message("simplifiable.conditional.expression.problem.descriptor", '\'' + exp.getText(), calculateReplacementExpression(exp));
    }
}
