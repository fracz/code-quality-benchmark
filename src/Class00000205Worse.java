// original filename: 00042132.txt
// before
public class Class00000205Worse {
    public void commit() {
        acquireSharedLock();
        try {
            final IndexTxSnapshot indexTxSnapshot = txSnapshot.get();
            if (indexTxSnapshot.clear)
                clear();
            commitSnapshot(indexTxSnapshot.indexSnapshot);
        } finally {
            releaseSharedLock();
        }
    }
}
