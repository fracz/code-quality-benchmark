// original filename: 00044091.txt
// after
public class Class00000592Worse {
    @Override
    public Long read(OChannelBinaryAsynchClient network, OStorageRemoteSession session) throws IOException {
        count = network.readLong();
        return count;
    }
}
