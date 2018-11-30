// original filename: 00003102.txt
// before
public class Class00000389Worse {
    public static InspectionResultsView getInvoker(AnActionEvent e) {
        return (InspectionResultsView) e.getDataContext().getData(DataConstantsEx.INSPECTION_VIEW);
    }
}
