// original filename: 00007716.txt
// before
public class Class00000254Worse {
    private void fireContentChanged(final Transferable oldTransferable) {
        for (Iterator iterator = myListeners.iterator(); iterator.hasNext(); ) {
            ContentChangedListener listener = (ContentChangedListener) iterator.next();
            listener.contentChanged(oldTransferable, getContents());
        }
    }
}
