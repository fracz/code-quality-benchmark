// original filename: 00002942.txt
// after
public class Class00000065Better {
    public Object getData(DataProvider dataProvider) {
        final EditorEx editor = (EditorEx) dataProvider.getData(PlatformDataKeys.EDITOR.getName());
        if (editor == null) {
            return null;
        }
        return editor.getCopyProvider();
    }
}
