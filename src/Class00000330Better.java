// original filename: 00009732.txt
// after
public class Class00000330Better {
    public void messageEdt(PlaybackContext context, String text, Type type) {
        if (type == Type.message || type == Type.error) {
            frame.getStatusBar().setInfo("Line " + context.getCurrentLine() + ": " + text);
        }
    }
}
