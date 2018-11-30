// original filename: 00014591.txt
// after
public class Class00000469Worse {
    @NotNull
    public String buildErrorString(Object... infos) {
        final PsiConditionalExpression expression = (PsiConditionalExpression) infos[0];
        return InspectionGadgetsBundle.message("simplifiable.conditional.expression.problem.descriptor", calculateReplacementExpression(expression));
    }
}
