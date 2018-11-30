// original filename: 00037140.txt
// after
public class Class00000478Worse {
    @Override
    public void cleanUp(boolean detachTraceObject) {
        if (detachTraceObject) {
            final TraceContext traceContext = getTraceContext();
            traceContext.removeTraceObject();
        }
        getRecorder().clear();
        getTestTcpDataSender().clear();
        ignoredServiceTypes.clear();
    }
}
