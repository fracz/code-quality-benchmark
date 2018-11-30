// original filename: 00021979.txt
// after
public class Class00000157Better {
    /**
     * Sets a {@link Bundle} that will be passed to subsequent APIs that
     * manipulate this dataset. For example, they are passed in as {@link
     * android.content.Intent#EXTRA_AUTO_FILL_EXTRAS extras} to your
     * authentication flow.
     */
    @NonNull
    public Builder setExtras(@Nullable Bundle extras) {
        throwIfDestroyed();
        mExtras = extras;
        return this;
    }
}
