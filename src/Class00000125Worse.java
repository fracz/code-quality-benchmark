// original filename: 00009243.txt
// before
public class Class00000125Worse {
    public void write(DataOutputStream s) throws IOException {
        s.writeUTF(myId);
        boolean hasRepo = myRepositoryPathOrUrl != null;
        s.writeBoolean(hasRepo);
        if (hasRepo)
            s.writeUTF(myRepositoryPathOrUrl);
        s.writeInt(myKind.getCode());
    }
}
