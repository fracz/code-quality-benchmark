// original filename: 00057981.txt
// after
public class Class00000513Worse {
    private static final String threadRootClass() {
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        StackTraceElement elem = trace[trace.length - 1];
        String clazz = elem.getClassName();
        return clazz;
    }
}
