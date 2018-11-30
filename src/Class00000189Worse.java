// original filename: 00028417.txt
// before
public class Class00000189Worse {
    @Override
    public DatagramSocketImpl endHandler(Handler<Void> endHandler) {
        return (DatagramSocketImpl) super.closeHandler(endHandler);
    }
}
