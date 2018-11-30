// original filename: 00054144.txt
// before
public class Class00000045Worse {
    @Before
    public void init() throws SQLException {
        shardingDataSource = getShardingDataSource();
        shardingConnection = shardingDataSource.getConnection();
        actual = shardingConnection.createStatement();
    }
}
