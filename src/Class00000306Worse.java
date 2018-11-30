// original filename: 00014953.txt
// before
public class Class00000306Worse {
    @Override
    public void windowEnteredFullScreen(AppEvent.FullScreenEvent event) {
        LOG.assertTrue(SystemInfo.isMac, "For mac we set myInFullScreen in the windowWillEnterFullScreenCallBack methods");
    }
}
