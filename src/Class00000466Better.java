// original filename: 00014254.txt
// before
public class Class00000466Better {
    public String buildErrorString(PsiElement location) {
        final PsiClass aClass = (PsiClass) location.getParent();
        final PsiClass superClass = aClass.getSuperClass();
        assert superClass != null;
        return InspectionGadgetsBundle.message("extends.concrete.collection.problem.descriptor", superClass.getQualifiedName());
    }
}
