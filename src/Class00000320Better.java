// original filename: 00034628.txt
// after
public class Class00000320Better {
    /**
     * Causes the animation to start over.
     * If animation is stopped any effects will occur after restart.<br>
     * If rewinding input source fails then state is not affected.
     * This method is thread-safe.
     */
    public void reset() {
        mExecutor.execute(new SafeRunnable(this) {

            @Override
            public void doWork() {
                if (mNativeInfoHandle.reset())
                    start();
            }
        });
    }
}
