// original filename: 00054144.txt
// after
public class Class00000045Better {
    @Before
    public void init() throws SQLException {
        shardingConnection = getShardingDataSource().getConnection();
        actual = shardingConnection.createStatement();
    }
}
