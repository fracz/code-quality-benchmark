// original filename: 00035014.txt
// before
public class Class00000178Worse {
    @Override
    public void finish() {
        pool.free(this);
        if (listener != null)
            listener.completed(this);
    }
}
