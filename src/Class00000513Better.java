// original filename: 00057981.txt
// before
public class Class00000513Better {
    private static String threadRootClass() {
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        StackTraceElement elem = trace[trace.length - 1];
        return elem.getClassName();
    }
}
