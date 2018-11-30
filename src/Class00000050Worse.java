// original filename: 00038139.txt
// before
public class Class00000050Worse {
    public LogBuffer putLong(long l) throws IOException {
        if (byteBuffer == null || (BUFFER_SIZE - byteBuffer.position()) < 8) {
            getNewDirectBuffer();
        }
        byteBuffer.putLong(l);
        return this;
    }
}
