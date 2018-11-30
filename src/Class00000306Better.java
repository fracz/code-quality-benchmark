// original filename: 00014953.txt
// after
public class Class00000306Better {
    @Override
    public void windowEnteredFullScreen(AppEvent.FullScreenEvent event) {
        if (!ORACLE_BUG_ID_8003173) {
            enterFullscreen();
        }
    }
}
