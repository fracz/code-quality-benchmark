// original filename: 00044120.txt
// before
public class Class00000587Better {
    @Override
    public OCluster[] read(OChannelBinaryAsynchClient network, OStorageRemoteSession session) throws IOException {
        return OStorageRemote.readDatabaseInformation(network);
    }
}
