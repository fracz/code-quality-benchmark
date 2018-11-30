// original filename: 00003157.txt
// before
public class Class00000268Worse {
    public static ThumbnailView getThumbnailView(AnActionEvent e) {
        DataContext dataContext = e.getDataContext();
        return (ThumbnailView) dataContext.getData(ThumbnailView.class.getName());
    }
}
