// original filename: 00034630.txt
// before
public class Class00000486Better {
    /**
     * Stops the animation. Does nothing if GIF is not animated.
     * This method is thread-safe.
     */
    @Override
    public void stop() {
        mIsRunning = false;
        mInvalidationHandler.removeMessages(0);
        mExecutor.execute(new SafeRunnable(this) {

            @Override
            public void doWork() {
                mNativeInfoHandle.saveRemainder();
            }
        });
    }
}
