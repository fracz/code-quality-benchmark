// original filename: 00011079.txt
// before
public class Class00000072Worse {
    public void addTabMouseListener(MouseListener listener) {
        removeListeners();
        myTabMouseListeners.add(listener);
        addListeners();
    }
}
