// original filename: 00054143.txt
// after
public class Class00000006Better {
    @Before
    public void init() throws SQLException {
        shardingConnection = getShardingDataSource().getConnection();
        statement = shardingConnection.createStatement();
        actual = statement.executeQuery("SELECT user_id AS `uid` FROM `t_order` WHERE `status` = 'init'");
    }
}
