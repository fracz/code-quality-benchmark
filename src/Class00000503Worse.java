// original filename: 00034668.txt
// after
public class Class00000503Worse {
    private void writePending() {
        // Log.i("NIO", "Writing to buffer...");
        if (mPendingWrites != null) {
            mDataSink.write(mPendingWrites);
            if (mPendingWrites.remaining() == 0)
                mPendingWrites = null;
        }
        if (mPendingWrites == null && mWritable != null)
            mWritable.onWriteable();
    }
}
