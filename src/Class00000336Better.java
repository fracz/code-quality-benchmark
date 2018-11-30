// original filename: 00049560.txt
// after
public class Class00000336Better {
    @Override
    public void showMessage(String message, DBPMessageType messageType) {
        updateStatus(new Status(messageType.getStatusCode(), DBeaverCore.PLUGIN_ID, message));
    }
}
