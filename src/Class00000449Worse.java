// original filename: 00054032.txt
// before
public class Class00000449Worse {
    /**
     * Add sharding state.
     *
     * @param shardingDataSource sharding datasource
     */
    public void addShardingState(final ShardingDataSource shardingDataSource) {
        String instanceNodePath = "/" + name + InstanceStateNode.ROOT + new InstanceStateNode().getInstanceId();
        persistState(instanceNodePath);
        addShardingInstancesStateChangeListener(instanceNodePath, shardingDataSource);
    }
}
