// original filename: 00002942.txt
// before
public class Class00000065Worse {
    public Object getData(DataProvider dataProvider) {
        EditorEx editor = (EditorEx) dataProvider.getData(DataConstants.EDITOR);
        if (editor == null)
            return null;
        CopyProvider copyProvider = editor.getCopyProvider();
        return copyProvider;
    }
}
