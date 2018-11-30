// original filename: 00057471.txt
// before
public class Class00000576Better {
    private static String threadRootClass() {
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        StackTraceElement elem = trace[trace.length - 1];
        return elem.getClassName();
    }
}
