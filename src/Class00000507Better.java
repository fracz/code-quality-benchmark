// original filename: 00051020.txt
// before
public class Class00000507Better {
    @Override
    public void setSchema(String schema) throws SQLException {
        try {
            getConnection().setSchema(schema);
        } catch (IncompatibleClassChangeError e) {
            throw new SQLFeatureNotSupportedException(JDBCConstants.ERROR_API_NOT_SUPPORTED_17);
        }
    }
}
