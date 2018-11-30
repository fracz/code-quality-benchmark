// original filename: 00001854.txt
// before
public class Class00000249Worse {
    public final void suspend() {
        synchronized (LOCK) {
            if (myDisposed)
                return;
            if (myRunning) {
                myRunning = false;
            } else {
                resetToStart();
            }
        }
    }
}
