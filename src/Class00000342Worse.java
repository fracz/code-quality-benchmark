// original filename: 00038815.txt
// before
public class Class00000342Worse {
    @Override
    public synchronized void stop() throws Throwable {
        log.info("Stopping");
        this.databaseHealth = null;
        dataSourceManager.stop();
        started = false;
    }
}
