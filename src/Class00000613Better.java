// original filename: 00039422.txt
// before
public class Class00000613Better {
    @Override
    protected void startUpMaster() {
        master = new MasterImpl(new EmbeddedGraphDatabase(MASTER_PATH.getAbsolutePath()));
    }
}
