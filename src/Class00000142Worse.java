// original filename: 00028269.txt
// before
public class Class00000142Worse {
    public WebSocketConnectOptions setMaxWebsocketFrameSize(int maxWebsocketFrameSize) {
        if (maxWebsocketFrameSize < 1) {
            throw new IllegalArgumentException("maxWebsocketFrameSize must be > 0");
        }
        this.maxWebsocketFrameSize = maxWebsocketFrameSize;
        return this;
    }
}
