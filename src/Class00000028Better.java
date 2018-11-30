// original filename: 00044099.txt
// after
public class Class00000028Better {
    @Override
    public OPhysicalPosition[] read(OChannelBinaryAsynchClient network, OStorageRemoteSession session) throws IOException {
        this.previousPositions = OBinaryProtocolHelper.readPhysicalPositions(network);
        return this.previousPositions;
    }
}
