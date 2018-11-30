// original filename: 00034452.txt
// after
public class Class00000598Worse {
    /**
     * Removes all {@link Crouton}s from the queue.
     */
    void clearCroutonQueue() {
        removeMessages(MESSAGE_DISPLAY_CROUTON);
        removeMessages(MESSAGE_ADD_CROUTON_TO_VIEW);
        removeMessages(MESSAGE_REMOVE_CROUTON);
        if (croutonQueue != null) {
            croutonQueue.clear();
        }
    }
}
