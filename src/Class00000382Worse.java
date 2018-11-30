// original filename: 00019771.txt
// before
public class Class00000382Worse {
    @Override
    public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
        if (conn != null) {
            return conn.createArrayOf(typeName, elements);
        }
        throw new SQLException("connection not init");
    }
}
