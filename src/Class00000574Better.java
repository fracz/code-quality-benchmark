// original filename: 00014152.txt
// before
public class Class00000574Better {
    public String buildErrorString(PsiElement location) {
        final PsiClass containingClass = ClassUtils.getContainingClass(location);
        assert containingClass != null;
        final String containingClassName = containingClass.getName();
        return InspectionGadgetsBundle.message("class.references.subclass.problem.descriptor", containingClassName);
    }
}
