// original filename: 00000494.txt
// after
public class Class00000516Worse {
    /**
     * {@inheritDoc}
     */
    public boolean removeAll(Channel channel) {
        ChannelCreation creation = channel2Creation.remove(channel);
        return !isClosed.get() && creation != null && connectionsPool.get(creation.key).remove(channel);
    }
}
