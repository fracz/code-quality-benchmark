// original filename: 00019775.txt
// after
public class Class00000208Better {
    @Override
    public SQLXML createSQLXML() throws SQLException {
        if (conn == null) {
            throw new SQLException("connection not init");
        }
        return conn.createSQLXML();
    }
}
