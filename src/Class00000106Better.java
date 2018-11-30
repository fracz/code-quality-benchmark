// original filename: 00014143.txt
// after
public class Class00000106Better {
    @NotNull
    public String buildErrorString(Object... infos) {
        final Integer count = (Integer) infos[0];
        return InspectionGadgetsBundle.message("class.too.deep.problem.descriptor", count);
    }
}
