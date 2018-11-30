// original filename: 00002975.txt
// before
public class Class00000134Worse {
    @Nullable
    public static DiffPanelImpl fromDataContext(DataContext dataContext) {
        DiffViewer viewer = (DiffViewer) dataContext.getData(DataConstants.DIFF_VIEWER);
        return viewer instanceof DiffPanelImpl ? (DiffPanelImpl) viewer : null;
    }
}
