// original filename: 00051697.txt
// before
public class Class00000295Worse {
    @Nullable
    @Override
    public DBPImage getObjectImage() {
        DBSTableColumn tableColumn = getAttribute();
        if (tableColumn instanceof DBPImageProvider) {
            return ((DBPImageProvider) tableColumn).getObjectImage();
        }
        return null;
    }
}
