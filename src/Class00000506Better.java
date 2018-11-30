// original filename: 00003423.txt
// before
public class Class00000506Better {
    @Override
    public void applicationDeactivated(IdeFrame ideFrame) {
        if (myStopOnAppDeactivation) {
            myCallback.message(PlaybackRunner.this, "App lost focus, stopping...", 0);
            stop();
        }
    }
}
