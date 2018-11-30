// original filename: 00019774.txt
// before
public class Class00000100Worse {
    @Override
    public NClob createNClob() throws SQLException {
        if (conn != null) {
            return conn.createNClob();
        }
        throw new SQLException("connection not init");
    }
}
