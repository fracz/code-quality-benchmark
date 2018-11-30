// original filename: 00040567.txt
// after
public class Class00000528Worse {
    /**
     * {@inheritDoc}
     */
    @Override
    public void bindingChanged(BindingProvider provider, String itemName) {
        logger.trace("bindingChanged {}", itemName);
        if (reminder != null) {
            reminder.cancel();
            reminder = null;
        }
        reminder = new NotificationsRequestReminder(NOTIFICATIONS_REORDER_WAIT_TIME);
    }
}
