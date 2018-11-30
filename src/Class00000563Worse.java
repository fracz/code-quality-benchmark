// original filename: 00029433.txt
// after
public class Class00000563Worse {
    @Override
    protected void doClose() throws ElasticSearchException {
        super.doClose();
        if (closeFileSystem) {
            try {
                fileSystem.close();
            } catch (IOException e) {
                // ignore
            }
        }
    }
}
