// original filename: 00034744.txt
// after
public class Class00000547Worse {
    @Override
    public void end() {
        if (null == mRawHeaders.get("Transfer-Encoding")) {
            send("text/html", "");
            onEnd();
            return;
        }
        initFirstWrite();
        mChunker.setMaxBuffer(Integer.MAX_VALUE);
        mChunker.write(new ByteBufferList());
        onEnd();
    }
}
