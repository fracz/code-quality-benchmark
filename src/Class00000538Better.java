// original filename: 00051017.txt
// before
public class Class00000538Better {
    @Override
    public int getNetworkTimeout() throws SQLException {
        try {
            return getConnection().getNetworkTimeout();
        } catch (IncompatibleClassChangeError e) {
            throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
        }
    }
}
