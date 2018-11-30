// original filename: 00038067.txt
// after
public class Class00000532Worse {
    @Override
    protected void startUpMaster(int numSlaves) {
        master = new MasterImpl(new EmbeddedGraphDatabase(dbPath(0).getAbsolutePath()));
    }
}
