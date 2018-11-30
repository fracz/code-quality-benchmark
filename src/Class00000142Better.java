// original filename: 00028269.txt
// after
public class Class00000142Better {
    public WebSocketConnectOptions setMaxWebsocketFrameSize(int maxWebsocketFrameSize) {
        Arguments.require(maxWebsocketFrameSize > 0, "maxWebsocketFrameSize must be > 0");
        this.maxWebsocketFrameSize = maxWebsocketFrameSize;
        return this;
    }
}
