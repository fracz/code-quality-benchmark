// original filename: 00049560.txt
// before
public class Class00000336Worse {
    @Override
    public void showMessage(String message, boolean error) {
        updateStatus(new Status(error ? Status.ERROR : Status.INFO, DBeaverCore.PLUGIN_ID, message));
    }
}
