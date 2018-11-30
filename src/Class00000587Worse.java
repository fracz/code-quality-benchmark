// original filename: 00044120.txt
// after
public class Class00000587Worse {
    @Override
    public OCluster[] read(OChannelBinaryAsynchClient network, OStorageRemoteSession session) throws IOException {
        this.clusters = OBinaryProtocolHelper.readClustersArray(network);
        return this.clusters;
    }
}
