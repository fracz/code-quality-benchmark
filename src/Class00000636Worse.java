// original filename: 00044096.txt
// after
public class Class00000636Worse {
    @Override
    public Long read(OChannelBinaryAsynchClient network, OStorageRemoteSession session) throws IOException {
        size = network.readLong();
        return size;
    }
}
