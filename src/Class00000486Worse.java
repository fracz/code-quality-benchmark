// original filename: 00034630.txt
// after
public class Class00000486Worse {
    /**
     * Stops the animation. Does nothing if GIF is not animated.
     * This method is thread-safe.
     */
    @Override
    public void stop() {
        mIsRunning = false;
        mInvalidationHandler.removeMessages(0);
        // noinspection StatementWithEmptyBody
        while (mExecutor.getQueue().remove(mRenderTask)) ;
        mNativeInfoHandle.saveRemainder();
    }
}
