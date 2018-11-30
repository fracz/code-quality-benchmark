// original filename: 00054032.txt
// after
public class Class00000449Better {
    /**
     * Add sharding state.
     *
     * @param shardingDataSource sharding datasource
     */
    public void addShardingState(final ShardingDataSource shardingDataSource) {
        String instanceNodePath = instanceStateNode.getFullPath();
        persistState(instanceNodePath);
        addShardingInstancesStateChangeListener(instanceNodePath, shardingDataSource);
    }
}
