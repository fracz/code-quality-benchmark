// original filename: 00014251.txt
// after
public class Class00000552Worse {
    @NotNull
    public String buildErrorString(Object... infos) {
        final PsiClass containingClass = (PsiClass) infos[0];
        return InspectionGadgetsBundle.message("extends.annotation.problem.descriptor", containingClass.getName());
    }
}
