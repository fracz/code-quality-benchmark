// original filename: 00023727.txt
// after
public class Class00000595Worse {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_SHOW_KEYBOARD_SHORTCUTS.equals(intent.getAction())) {
            KeyboardShortcuts.show(context, -1);
        }
    }
}
