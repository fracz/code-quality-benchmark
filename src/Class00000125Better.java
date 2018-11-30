// original filename: 00009243.txt
// after
public class Class00000125Better {
    public synchronized void write(DataOutputStream s) throws IOException {
        s.writeInt(myKind.getCode());
        s.writeUTF(myId);
        writeStringOrNull(s, myRepositoryPathOrUrl);
        writeStringOrNull(s, myDataDir);
    }
}
