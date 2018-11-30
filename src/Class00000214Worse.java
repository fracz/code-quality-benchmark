// original filename: 00033702.txt
// before
public class Class00000214Worse {
    protected ProgressLoggerFactory createProgressLoggerFactory() {
        return new DefaultProgressLoggerFactory(get(ListenerManager.class).getBroadcaster(ProgressListener.class), new TrueTimeProvider());
    }
}
