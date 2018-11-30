// original filename: 00000488.txt
// after
public class Class00000335Better {
    /**
     * {@inheritDoc}
     */
    public boolean canCacheConnection() {
        // FIXME: doesn't account for borrowed channels
        return !isClosed.get() && (maxTotalConnectionsDisabled || size.get() < maxTotalConnections);
    }
}
