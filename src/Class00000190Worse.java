// original filename: 00012397.txt
// before
public class Class00000190Worse {
    @Override
    protected void onFailure() {
        GitVcs.IMPORTANT_ERROR_NOTIFICATION.createNotification(myErrorMessage, NotificationType.ERROR).notify(myProject);
    }
}
