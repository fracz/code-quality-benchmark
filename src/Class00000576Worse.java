// original filename: 00057471.txt
// after
public class Class00000576Worse {
    private static final String threadRootClass() {
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        StackTraceElement elem = trace[trace.length - 1];
        String clazz = elem.getClassName();
        return clazz;
    }
}
