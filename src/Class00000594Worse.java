// original filename: 00014479.txt
// after
public class Class00000594Worse {
    @NotNull
    public String buildErrorString(Object... infos) {
        final PsiMethod element = (PsiMethod) infos[0];
        if (element.isConstructor()) {
            return InspectionGadgetsBundle.message("overloaded.vararg.constructor.problem.descriptor");
        } else {
            return InspectionGadgetsBundle.message("overloaded.vararg.method.problem.descriptor");
        }
    }
}
