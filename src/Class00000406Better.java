// original filename: 00019802.txt
// after
public class Class00000406Better {
    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        return new HBaseConnection(url, info);
    }
}
