// original filename: 00039508.txt
// before
public class Class00000456Worse {
    public LogBuffer putLong(long l) throws IOException {
        if (byteBuffer == null || (BUFFER_SIZE - byteBuffer.position()) < 8) {
            getNewDirectBuffer();
        }
        byteBuffer.putLong(l);
        return this;
    }
}
