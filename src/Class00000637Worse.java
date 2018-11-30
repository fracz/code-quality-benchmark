// original filename: 00022461.txt
// after
public class Class00000637Worse {
    /**
     * Removes a dead service.
     *
     * @param service The service.
     * @return True if the service was removed, false otherwise.
     */
    private boolean removeDeadServiceLocked(Service service) {
        if (false) {
            Slog.i(LOG_TAG, "Dead service " + service.mService + " removed");
        }
        mHandler.removeMessages(service.mId);
        return mServices.remove(service);
    }
}
