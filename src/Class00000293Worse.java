// original filename: 00034751.txt
// before
public class Class00000293Worse {
    public void close() {
        closed = true;
        try {
            zop.close();
        } catch (IOException e) {
            report(e);
            return;
        }
        write(new ByteBufferList());
    }
}
