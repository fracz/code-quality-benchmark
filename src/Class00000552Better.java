// original filename: 00014251.txt
// before
public class Class00000552Better {
    public String buildErrorString(PsiElement location) {
        final PsiClass containingClass = ClassUtils.getContainingClass(location);
        assert containingClass != null;
        return InspectionGadgetsBundle.message("extends.annotation.problem.descriptor", containingClass.getName());
    }
}
