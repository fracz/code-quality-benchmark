// original filename: 00023336.txt
// before
public class Class00000589Better {
    public void resetRateLimiting(@NonNull ShortcutService s) {
        if (ShortcutService.DEBUG) {
            Slog.d(TAG, "resetRateLimiting: " + getPackageName());
        }
        if (mApiCallCount > 0) {
            mApiCallCount = 0;
            s.scheduleSaveUser(getOwnerUserId());
        }
    }
}
