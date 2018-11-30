// original filename: 00044099.txt
// before
public class Class00000028Worse {
    @Override
    public OPhysicalPosition[] read(OChannelBinaryAsynchClient network, OStorageRemoteSession session) throws IOException {
        final int positionsCount = network.readInt();
        if (positionsCount == 0) {
            return OCommonConst.EMPTY_PHYSICAL_POSITIONS_ARRAY;
        } else {
            return OStorageRemote.readPhysicalPositions(network, positionsCount);
        }
    }
}
