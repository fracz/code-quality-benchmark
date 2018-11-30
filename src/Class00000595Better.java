// original filename: 00023727.txt
// before
public class Class00000595Better {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_SHOW_KEYBOARD_SHORTCUTS.equals(intent.getAction())) {
            final KeyboardShortcuts keyboardShortcuts = new KeyboardShortcuts(context);
            keyboardShortcuts.toggleKeyboardShortcuts(-1);
        }
    }
}
