// original filename: 00054745.txt
// after
public class Class00000565Worse {
    @Test
    public void assertDoEqualSharding() {
        PreciseShardingValue shardingValue = null;
        assertThat(noneTableShardingAlgorithm.doSharding(targets, shardingValue), is("tbl"));
    }
}
