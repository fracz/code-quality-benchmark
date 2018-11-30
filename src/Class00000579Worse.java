// original filename: 00013245.txt
// after
public class Class00000579Worse {
    public void run() {
        VirtualFile virtualFile = context.getVirtualFile();
        FileEditor editor = FileEditorManager.getInstance(myProject).getSelectedEditor(virtualFile);
        if (editor != null) {
            structureView.selectCurrentElement(editor, requestFocus);
        }
    }
}
