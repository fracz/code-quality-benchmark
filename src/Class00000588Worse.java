// original filename: 00054496.txt
// after
public class Class00000588Worse {
    @Override
    public void close() throws SQLException {
        HintManagerHolder.clear();
        MasterSlaveDataSource.resetDMLFlag();
        super.close();
    }
}
