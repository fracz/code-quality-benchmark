// original filename: 00002975.txt
// after
public class Class00000134Better {
    @Nullable
    public static DiffPanelImpl fromDataContext(DataContext dataContext) {
        DiffViewer viewer = PlatformDataKeys.DIFF_VIEWER.getData(dataContext);
        return viewer instanceof DiffPanelImpl ? (DiffPanelImpl) viewer : null;
    }
}
