// original filename: 00060586.txt
// after
public class Class00000232Better {
    /**
     * Close current splash screen
     */
    public void close() {
        Logger.getRootLogger().removeAppender(splashOutputWriter);
        dispose();
    }
}
