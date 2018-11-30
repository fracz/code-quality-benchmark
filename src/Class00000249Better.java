// original filename: 00001854.txt
// after
public class Class00000249Better {
    public final void suspend() {
        synchronized (LOCK) {
            if (isDisposed() || !isRunning())
                return;
            myState = TimerState.suspended;
        }
    }
}
