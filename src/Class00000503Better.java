// original filename: 00034668.txt
// before
public class Class00000503Better {
    private void writePending() {
        // Log.i("NIO", "Writing to buffer...");
        mDataSink.write(mPendingWrites);
        if (mPendingWrites.remaining() == 0) {
            mPendingWrites = null;
            onFlushed();
        }
    }
}
