// original filename: 00023155.txt
// before
public class Class00000020Worse {
    /**
     * Dismiss the Keyboard Shortcuts screen.
     */
    public final void dismissKeyboardShortcutsHelper() {
        Intent intent = new Intent(Intent.ACTION_DISMISS_KEYBOARD_SHORTCUTS);
        intent.setComponent(new ComponentName(KEYBOARD_SHORTCUTS_RECEIVER_PKG_NAME, KEYBOARD_SHORTCUTS_RECEIVER_CLASS_NAME));
        sendBroadcast(intent);
    }
}
