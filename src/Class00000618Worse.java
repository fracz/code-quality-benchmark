// original filename: 00044090.txt
// after
public class Class00000618Worse {
    @Override
    public Long read(OChannelBinaryAsynchClient network, OStorageRemoteSession session) throws IOException {
        countRecords = network.readLong();
        return countRecords;
    }
}
