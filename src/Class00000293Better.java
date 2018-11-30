// original filename: 00034751.txt
// after
public class Class00000293Better {
    public void close() {
        try {
            zop.close();
        } catch (IOException e) {
            report(e);
            return;
        }
        write(new ByteBufferList(), true);
    }
}
