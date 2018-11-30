// original filename: 00014695.txt
// before
public class Class00000560Better {
    @Nullable
    protected String buildErrorString(PsiElement location) {
        if (location instanceof PsiJavaToken) {
            return InspectionGadgetsBundle.message("test.case.with.constructor.problem.descriptor.initializer");
        } else {
            return InspectionGadgetsBundle.message("test.case.with.constructor.problem.descriptor");
        }
    }
}
