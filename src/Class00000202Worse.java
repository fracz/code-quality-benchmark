// original filename: 00035426.txt
// before
public class Class00000202Worse {
    void add(final BaseDownloadTask downloadInternal) {
        ready(downloadInternal);
        // Notify 2 Listener
        downloadInternal.getMessenger().notifyBegin();
    }
}
