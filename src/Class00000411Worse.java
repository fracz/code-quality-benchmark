// original filename: 00039505.txt
// before
public class Class00000411Worse {
    public LogBuffer putInt(int i) throws IOException {
        buffer.clear();
        buffer.putInt(i);
        buffer.flip();
        fileChannel.write(buffer);
        return this;
    }
}
