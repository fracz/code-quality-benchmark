// original filename: 00037140.txt
// before
public class Class00000478Better {
    @Override
    public void cleanUp(boolean detachTraceObject) {
        if (detachTraceObject) {
            getTraceContext().removeTraceObject();
        }
        getRecorder().clear();
        getTestTcpDataSender().clear();
        ignoredServiceTypes.clear();
    }
}
