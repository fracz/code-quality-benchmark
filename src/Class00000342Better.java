// original filename: 00038815.txt
// after
public class Class00000342Better {
    @Override
    public synchronized void stop() throws Throwable {
        log.info("Stopping");
        databaseHealth = null;
        localCommit = null;
        dataSourceManager.stop();
        started = false;
    }
}
