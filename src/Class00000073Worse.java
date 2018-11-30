// original filename: 00023383.txt
// before
public class Class00000073Worse {
    private long getLowStorageThreshold() {
        @SuppressWarnings("deprecation") final long lowThreshold = StorageManager.from(this).getStorageLowBytes(mDataDir);
        if (lowThreshold == 0) {
            Log.e(TAG, "Invalid low storage threshold");
        }
        return lowThreshold;
    }
}
