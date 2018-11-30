// original filename: 00028270.txt
// before
public class Class00000400Worse {
    @Override
    public WebSocketConnectOptions setPort(int port) {
        if (port < 1 || port > 65535) {
            throw new IllegalArgumentException("port p must be in range 1 <=p <= 65535");
        }
        this.port = port;
        return this;
    }
}
