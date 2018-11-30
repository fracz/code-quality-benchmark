// original filename: 00019772.txt
// after
public class Class00000133Better {
    @Override
    public Blob createBlob() throws SQLException {
        if (conn == null) {
            throw new SQLException("connection not init");
        }
        return conn.createBlob();
    }
}
