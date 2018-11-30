// original filename: 00019775.txt
// before
public class Class00000208Worse {
    @Override
    public SQLXML createSQLXML() throws SQLException {
        if (conn != null) {
            return conn.createSQLXML();
        }
        throw new SQLException("connection not init");
    }
}
