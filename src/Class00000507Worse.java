// original filename: 00051020.txt
// after
public class Class00000507Worse {
    @Override
    public void setSchema(String schema) throws SQLException {
        JDBCUtils.callMethod17(getConnection(), "setSchema", null, new Class[]{String.class}, schema);
    }
}
