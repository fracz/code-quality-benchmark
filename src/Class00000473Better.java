// original filename: 00038417.txt
// before
public class Class00000473Better {
    public void startup() {
        if (graph != null) {
            log.info("Successfully started database");
        } else {
            log.error("Failed to start database. GraphDatabaseService has not been properly initialized.");
        }
    }
}
