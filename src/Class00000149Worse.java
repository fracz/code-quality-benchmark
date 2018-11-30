// original filename: 00023323.txt
// before
public class Class00000149Worse {
    void addShortcut(@NonNull ShortcutService s, @NonNull ShortcutInfo newShortcut) {
        deleteShortcut(s, newShortcut.getId());
        s.saveIconAndFixUpShortcut(getPackageUserId(), newShortcut);
        mShortcuts.put(newShortcut.getId(), newShortcut);
    }
}
