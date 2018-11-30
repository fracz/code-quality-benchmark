// original filename: 00007716.txt
// after
public class Class00000254Better {
    private void fireContentChanged(final Transferable oldTransferable) {
        for (final Object aListener : myListeners) {
            ContentChangedListener listener = (ContentChangedListener) aListener;
            listener.contentChanged(oldTransferable, getContents());
        }
    }
}
