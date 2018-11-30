// original filename: 00052831.txt
// after
public class Class00000221Better {
    @Test
    public void assertParse() {
        new SQLParserEngine(DatabaseType.MySQL, getSql(), new ShardingRuleMockBuilder().addShardingColumns("user_id").addShardingColumns("order_id").addShardingColumns("state").addAutoIncrementColumn("order", "order_id").addAutoIncrementColumn("payment", "id").addAutoIncrementColumn("payment", "order_id").build(), Collections.emptyList()).parseStatement();
    }
}
