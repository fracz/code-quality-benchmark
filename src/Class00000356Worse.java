// original filename: 00023185.txt
// before
public class Class00000356Worse {
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
