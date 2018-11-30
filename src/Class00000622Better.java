// original filename: 00035325.txt
// before
public class Class00000622Better {
    public boolean post2UI(final Runnable runnable) {
        if (handler == null) {
            return false;
        }
        return handler.post(runnable);
    }
}
