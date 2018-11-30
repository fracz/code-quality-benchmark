// original filename: 00052831.txt
// before
public class Class00000221Worse {
    @Test
    public void assertParse() {
        assertSQLParsedResult(SQLParserFactory.create(DatabaseType.MySQL, getSql(), Collections.emptyList(), new ShardingRuleMockBuilder().addShardingColumns("user_id").addShardingColumns("order_id").addShardingColumns("state").addAutoIncrementColumn("order", "order_id").addAutoIncrementColumn("payment", "id").addAutoIncrementColumn("payment", "order_id").build()).parse());
    }
}
