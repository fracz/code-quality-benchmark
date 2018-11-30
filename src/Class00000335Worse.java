// original filename: 00000488.txt
// before
public class Class00000335Worse {
    /**
     * {@inheritDoc}
     */
    public boolean canCacheConnection() {
        return !closed.get() && (maxTotalConnections == -1 || channel2IdleChannel.size() < maxTotalConnections);
    }
}
