// original filename: 00054142.txt
// before
public class Class00000227Worse {
    @Before
    public void init() throws SQLException {
        shardingDataSource = getShardingDataSource();
        shardingConnection = shardingDataSource.getConnection();
        actual = shardingConnection.prepareStatement("SELECT user_id AS `uid` FROM `t_order` WHERE `status` = 'init'");
    }
}
