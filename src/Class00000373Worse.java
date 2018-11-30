// original filename: 00039507.txt
// before
public class Class00000373Worse {
    public LogBuffer putInt(int i) throws IOException {
        if (byteBuffer == null || (BUFFER_SIZE - byteBuffer.position()) < 4) {
            getNewDirectBuffer();
        }
        byteBuffer.putInt(i);
        return this;
    }
}
