// original filename: 00048915.txt
// before
public class Class00000144Worse {
    public Image getCellImage(int column, int row) {
        IGridLabelProvider contentLabelProvider = getContentLabelProvider();
        if (contentLabelProvider != null) {
            return contentLabelProvider.getImage(column, row);
        }
        return null;
    }
}
