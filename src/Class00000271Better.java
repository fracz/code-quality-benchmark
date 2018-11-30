// original filename: 00037249.txt
// after
public class Class00000271Better {
    @Override
    public Trace disableSampling() {
        final Trace trace = this.delegate.disableSampling();
        attachTrace(trace);
        return trace;
    }
}
