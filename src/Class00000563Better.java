// original filename: 00029433.txt
// before
public class Class00000563Better {
    @Override
    protected void doClose() throws ElasticSearchException {
        if (closeFileSystem) {
            try {
                fileSystem.close();
            } catch (IOException e) {
                logger.warn("Failed to close file system {}", fileSystem);
            }
        }
    }
}
