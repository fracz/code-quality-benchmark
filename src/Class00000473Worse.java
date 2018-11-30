// original filename: 00038417.txt
// after
public class Class00000473Worse {
    /**
     * Will be removed in 1.10
     */
    @Deprecated
    public void startup() {
        try {
            start();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
