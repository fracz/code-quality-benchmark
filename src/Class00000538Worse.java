// original filename: 00051017.txt
// after
public class Class00000538Worse {
    @Override
    public int getNetworkTimeout() throws SQLException {
        return JDBCUtils.callMethod17(getConnection(), "getNetworkTimeout", Integer.class, null);
    }
}
