// original filename: 00003082.txt
// after
public class Class00000135Better {
    public Object getData(DataProvider dataProvider) {
        final EditorEx editor = (EditorEx) dataProvider.getData(PlatformDataKeys.EDITOR.getName());
        if (editor == null) {
            return null;
        }
        return editor.getPasteProvider();
    }
}
