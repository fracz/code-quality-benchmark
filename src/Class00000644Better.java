// original filename: 00033096.txt
// before
public class Class00000644Better {
    public void markClean(RandomAccessFile lockFileAccess, int ownerId) throws IOException {
        writeState(lockFileAccess, new StateInfo(ownerId, false));
    }
}
