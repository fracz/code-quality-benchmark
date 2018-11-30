// original filename: 00038067.txt
// before
public class Class00000532Better {
    @Override
    protected void startUpMaster() {
        master = new MasterImpl(new EmbeddedGraphDatabase(MASTER_PATH.getAbsolutePath()));
    }
}
