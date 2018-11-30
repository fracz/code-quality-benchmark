// original filename: 00014695.txt
// after
public class Class00000560Worse {
    @NotNull
    protected String buildErrorString(Object... infos) {
        if (Boolean.TRUE.equals(infos[0])) {
            return InspectionGadgetsBundle.message("test.case.with.constructor.problem.descriptor.initializer");
        } else {
            return InspectionGadgetsBundle.message("test.case.with.constructor.problem.descriptor");
        }
    }
}
