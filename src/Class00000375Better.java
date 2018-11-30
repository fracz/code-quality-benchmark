// original filename: 00023415.txt
// after
public class Class00000375Better {
    public void onRemoveCompleted(String packageName, boolean succeeded) {
        synchronized (backupManagerService.getClearDataLock()) {
            backupManagerService.setClearingData(false);
            backupManagerService.getClearDataLock().notifyAll();
        }
    }
}
