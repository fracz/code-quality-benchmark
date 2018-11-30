// original filename: 00013245.txt
// before
public class Class00000579Better {
    public void run() {
        VirtualFile virtualFile = theElement.getContainingFile().getVirtualFile();
        FileEditor editor = FileEditorManager.getInstance(myProject).getSelectedEditor(virtualFile);
        structureView.select(theElement, editor, requestFocus);
    }
}
