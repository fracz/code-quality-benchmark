// original filename: 00034452.txt
// before
public class Class00000598Better {
    /**
     * Removes all {@link Crouton}s from the queue.
     */
    void clearCroutonQueue() {
        if (croutonQueue != null) {
            croutonQueue.clear();
        }
        removeMessages(MESSAGE_DISPLAY_CROUTON);
        removeMessages(MESSAGE_ADD_CROUTON_TO_VIEW);
        removeMessages(MESSAGE_REMOVE_CROUTON);
    }
}
