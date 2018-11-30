// original filename: 00014143.txt
// before
public class Class00000106Worse {
    public String buildErrorString(PsiElement location) {
        final PsiClass aClass = (PsiClass) location.getParent();
        final int count = getInheritanceDepth(aClass, new HashSet<PsiClass>());
        return InspectionGadgetsBundle.message("class.too.deep.problem.descriptor", count);
    }
}
