// original filename: 00060085.txt
// after
public class Class00000167Better {
    @Override
    public void open() {
        BerkeleyJEStorageManager sm = new BerkeleyJEStorageManager(DiskgraphTest.getDirectoryStorageConfiguration());
        tx = sm.beginTransaction();
        store = sm.openDatabase(storeName);
        manager = sm;
    }
}
