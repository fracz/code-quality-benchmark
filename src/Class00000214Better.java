// original filename: 00033702.txt
// after
public class Class00000214Better {
    private ProgressLoggerFactory createProgressLoggerFactory(ListenerManager listenerManager) {
        return new DefaultProgressLoggerFactory(listenerManager.getBroadcaster(ProgressListener.class), new TrueTimeProvider());
    }
}
