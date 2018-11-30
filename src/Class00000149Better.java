// original filename: 00023323.txt
// after
public class Class00000149Better {
    void addShortcut(@NonNull ShortcutInfo newShortcut) {
        deleteShortcut(newShortcut.getId());
        mShortcutUser.mService.saveIconAndFixUpShortcut(getPackageUserId(), newShortcut);
        mShortcuts.put(newShortcut.getId(), newShortcut);
    }
}
