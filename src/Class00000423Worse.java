// original filename: 00001848.txt
// before
public class Class00000423Worse {
    public final void dispose() {
        synchronized (LOCK) {
            myDisposed = true;
            suspend();
        }
    }
}
