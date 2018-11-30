// original filename: 00051021.txt
// before
public class Class00000615Better {
    @Override
    public boolean generatedKeyAlwaysReturned() throws SQLException {
        try {
            return getOriginal().generatedKeyAlwaysReturned();
        } catch (IncompatibleClassChangeError e) {
            throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
        }
    }
}
