// original filename: 00023155.txt
// after
public class Class00000020Better {
    /**
     * Dismiss the Keyboard Shortcuts screen.
     */
    public final void dismissKeyboardShortcutsHelper() {
        Intent intent = new Intent(Intent.ACTION_DISMISS_KEYBOARD_SHORTCUTS);
        intent.setPackage(KEYBOARD_SHORTCUTS_RECEIVER_PKG_NAME);
        sendBroadcastAsUser(intent, UserHandle.SYSTEM);
    }
}
