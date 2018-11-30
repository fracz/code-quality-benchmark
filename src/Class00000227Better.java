// original filename: 00054142.txt
// after
public class Class00000227Better {
    @Before
    public void init() throws SQLException {
        shardingConnection = getShardingDataSource().getConnection();
        actual = shardingConnection.prepareStatement("SELECT user_id AS `uid` FROM `t_order` WHERE `status` = 'init'");
    }
}
