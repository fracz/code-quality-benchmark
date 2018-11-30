// original filename: 00033096.txt
// after
public class Class00000644Worse {
    public StateInfo markClean(RandomAccessFile lockFileAccess, int ownerId) throws IOException {
        StateInfo stateInfo = new StateInfo(ownerId, false);
        writeState(lockFileAccess, stateInfo);
        return stateInfo;
    }
}
