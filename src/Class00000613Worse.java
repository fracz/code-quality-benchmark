// original filename: 00039422.txt
// after
public class Class00000613Worse {
    @Override
    protected void startUpMaster(int numSlaves) {
        master = new MasterImpl(new EmbeddedGraphDatabase(dbPath(0).getAbsolutePath()));
    }
}
