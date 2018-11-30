// original filename: 00003423.txt
// after
public class Class00000506Worse {
    @Override
    public void applicationDeactivated(IdeFrame ideFrame) {
        if (myStopOnAppDeactivation) {
            myCallback.message(null, "App lost focus, stopping...", 0, StatusCallback.Type.message);
            stop();
        }
    }
}
