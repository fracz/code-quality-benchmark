// original filename: 00042954.txt
// before
public class Class00000487Better {
    @Override
    public Boolean read(OChannelBinaryAsynchClient network, OStorageRemoteSession session) throws IOException {
        return network.readByte() == 1;
    }
}
