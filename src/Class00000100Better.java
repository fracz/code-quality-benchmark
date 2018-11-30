// original filename: 00019774.txt
// after
public class Class00000100Better {
    @Override
    public NClob createNClob() throws SQLException {
        if (conn == null) {
            throw new SQLException("connection not init");
        }
        return conn.createNClob();
    }
}
