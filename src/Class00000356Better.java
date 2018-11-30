// original filename: 00023185.txt
// after
public class Class00000356Better {
    /**
     * Removes a dead service.
     *
     * @param service The service.
     * @return True if the service was removed, false otherwise.
     */
    private boolean removeDeadServiceLocked(Service service) {
        if (DEBUG) {
            Slog.i(LOG_TAG, "Dead service " + service.mService + " removed");
        }
        mHandler.removeMessages(service.mId);
        updateStateOnDisabledService(service);
        return mServices.remove(service);
    }
}
