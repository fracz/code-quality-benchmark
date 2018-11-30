// original filename: 00044089.txt
// after
public class Class00000043Better {
    @Override
    public OPhysicalPosition[] read(OChannelBinaryAsynchClient network, OStorageRemoteSession session) throws IOException {
        positions = OBinaryProtocolHelper.readPhysicalPositions(network);
        return positions;
    }
}
