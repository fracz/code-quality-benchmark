// original filename: 00014479.txt
// before
public class Class00000594Better {
    public String buildErrorString(PsiElement location) {
        final PsiMethod element = (PsiMethod) location.getParent();
        if (element.isConstructor()) {
            return InspectionGadgetsBundle.message("overloaded.vararg.constructor.problem.descriptor");
        } else {
            return InspectionGadgetsBundle.message("overloaded.vararg.method.problem.descriptor");
        }
    }
}
