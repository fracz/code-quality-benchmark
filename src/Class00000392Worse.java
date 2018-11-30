// original filename: 00035026.txt
// before
public class Class00000392Worse {
    @Override
    public void finish() {
        pool.free(this);
        if (listener != null)
            listener.completed(this);
    }
}
