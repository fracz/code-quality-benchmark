// original filename: 00028270.txt
// after
public class Class00000400Better {
    @Override
    public WebSocketConnectOptions setPort(int port) {
        Arguments.requireInRange(port, 1, 65535, "port p must be in range 1 <= p <= 65535");
        this.port = port;
        return this;
    }
}
