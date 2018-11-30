// original filename: 00013058.txt
// before
public class Class00000575Better {
    private void storeRefreshStatusToFiles() {
        if (FileWatcher.isAvailable()) {
            markPathsDirty(getAndClear(myDirtyFiles));
            markPathsDirty(getAndClear(myDeletedFiles));
        }
    }
}
