// original filename: 00003082.txt
// before
public class Class00000135Worse {
    public Object getData(DataProvider dataProvider) {
        EditorEx editor = (EditorEx) dataProvider.getData(DataConstants.EDITOR);
        if (editor == null)
            return null;
        PasteProvider pasteProvider = editor.getPasteProvider();
        return pasteProvider;
    }
}
