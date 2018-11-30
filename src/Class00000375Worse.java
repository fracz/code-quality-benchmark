// original filename: 00023415.txt
// before
public class Class00000375Worse {
    public void onRemoveCompleted(String packageName, boolean succeeded) {
        synchronized (backupManagerService.mClearDataLock) {
            backupManagerService.mClearingData = false;
            backupManagerService.mClearDataLock.notifyAll();
        }
    }
}
