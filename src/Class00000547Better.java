// original filename: 00034744.txt
// before
public class Class00000547Better {
    @Override
    public void end() {
        if (null == mRawHeaders.get("Transfer-Encoding")) {
            send("text/html", "");
            onEnd();
            return;
        }
        writeInternal(ByteBuffer.wrap(new byte[0]));
        onEnd();
    }
}
