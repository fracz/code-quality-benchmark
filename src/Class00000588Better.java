// original filename: 00054496.txt
// before
public class Class00000588Better {
    @Override
    public void close() throws SQLException {
        super.close();
        HintManagerHolder.clear();
        MasterSlaveDataSource.resetDMLFlag();
    }
}
