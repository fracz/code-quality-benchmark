// original filename: 00046151.txt
// before
public class Class00000137Worse {
    @Override
    public String commit() {
        storageManager.commit(outputHandle);
        return Joiner.on(':').join(nodeId, outputHandle.getShardUuid());
    }
}
