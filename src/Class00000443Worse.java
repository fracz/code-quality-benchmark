// original filename: 00028443.txt
// before
public class Class00000443Worse {
    @Override
    public NetSocket netSocket() {
        if (!resumed) {
            resumed = true;
            vertx.getContext().execute(() -> {
                // resume the socket now as the user had the chance to register a dataHandler
                socket.resume();
            });
        }
        return socket;
    }
}
