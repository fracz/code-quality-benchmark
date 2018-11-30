// original filename: 00054143.txt
// before
public class Class00000006Worse {
    @Before
    public void init() throws SQLException {
        shardingDataSource = getShardingDataSource();
        shardingConnection = shardingDataSource.getConnection();
        statement = shardingConnection.createStatement();
        actual = statement.executeQuery("SELECT user_id AS `uid` FROM `t_order` WHERE `status` = 'init'");
    }
}
