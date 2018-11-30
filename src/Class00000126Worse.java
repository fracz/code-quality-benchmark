// original filename: 00037404.txt
// before
public class Class00000126Worse {
    @Override
    public Trace removeTraceObject() {
        final Trace trace = currentRawTraceObject();
        this.threadLocal.remove();
        return trace;
    }
}
