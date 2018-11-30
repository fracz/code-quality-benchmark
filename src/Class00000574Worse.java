// original filename: 00014152.txt
// after
public class Class00000574Worse {
    @NotNull
    public String buildErrorString(Object... infos) {
        final PsiNamedElement element = (PsiNamedElement) infos[0];
        final String containingClassName = element.getName();
        return InspectionGadgetsBundle.message("class.references.subclass.problem.descriptor", containingClassName);
    }
}
