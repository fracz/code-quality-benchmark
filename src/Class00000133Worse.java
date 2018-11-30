// original filename: 00019772.txt
// before
public class Class00000133Worse {
    @Override
    public Blob createBlob() throws SQLException {
        if (conn != null) {
            return conn.createBlob();
        }
        throw new SQLException("connection not init");
    }
}
