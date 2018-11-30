// original filename: 00060085.txt
// before
public class Class00000167Worse {
    @Override
    public void open() {
        BerkeleyJEStorageManager sm = new BerkeleyJEStorageManager(DiskgraphTest.homeDirFile, readOnly, transactional, false);
        sm.initialize(cachePercent);
        tx = sm.beginTransaction();
        store = sm.openDatabase(storeName);
        manager = sm;
    }
}
