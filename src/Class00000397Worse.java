// original filename: 00054141.txt
// before
public class Class00000397Worse {
    @Before
    public void init() throws SQLException {
        shardingDataSource = getShardingDataSource();
        actual = shardingDataSource.getConnection();
    }
}
