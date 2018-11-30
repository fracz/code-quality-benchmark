// original filename: 00009732.txt
// before
public class Class00000330Worse {
    public void messageEdt(PlaybackContext context, String text, int curentLine, Type type) {
        if (type == Type.message || type == Type.error) {
            frame.getStatusBar().setInfo("Line " + curentLine + ": " + text);
        }
    }
}
