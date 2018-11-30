// original filename: 00021979.txt
// before
public class Class00000157Worse {
    /**
     * Sets a {@link Bundle} that will be passed to subsequent calls to
     * {@link android.service.autofill.AutoFillService} methods such as
     * {@link android.service.autofill.AutoFillService#onSaveRequest(android.app.assist.AssistStructure,
     * Bundle, android.service.autofill.SaveCallback)}, using
     * {@link android.service.autofill.AutoFillService#EXTRA_DATASET_EXTRAS} as the key.
     * <p>
     * <p>It can be used to keep service state in between calls.
     */
    public Builder setExtras(Bundle extras) {
        // TODO(b/33197203): make sure that either this method or the requires-Authentication
        // ones are called, but not both
        mExtras = Objects.requireNonNull(extras, "extras cannot be null");
        return this;
    }
}
