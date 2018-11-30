// original filename: 00037249.txt
// before
public class Class00000271Worse {
    @Override
    public Trace disableSampling() {
        final Trace trace = this.delegate.disableSampling();
        // attachTrace(trace);
        return trace;
    }
}
