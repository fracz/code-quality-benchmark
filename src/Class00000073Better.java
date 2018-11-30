// original filename: 00023383.txt
// after
public class Class00000073Better {
    private long getLowStorageThreshold(Context context) {
        @SuppressWarnings("deprecation") final long lowThreshold = StorageManager.from(context).getStorageLowBytes(mDataDir);
        if (lowThreshold == 0) {
            Log.e(TAG, "Invalid low storage threshold");
        }
        return lowThreshold;
    }
}
