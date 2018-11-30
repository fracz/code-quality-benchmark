// original filename: 00014254.txt
// after
public class Class00000466Worse {
    @NotNull
    public String buildErrorString(Object... infos) {
        final PsiClass superClass = (PsiClass) infos[0];
        return InspectionGadgetsBundle.message("extends.concrete.collection.problem.descriptor", superClass.getQualifiedName());
    }
}
