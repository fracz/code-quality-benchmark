// original filename: 00019771.txt
// after
public class Class00000382Better {
    @Override
    public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
        if (conn == null) {
            throw new SQLException("connection not init");
        }
        return conn.createArrayOf(typeName, elements);
    }
}
