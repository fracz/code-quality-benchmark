// original filename: 00030639.txt
// after
public class Class00000148Better {
    /**
     * Determine if any mappings need to be updated, and update them on the master node if
     * necessary. Returnes a failure Exception in the event updating the mappings fails or null if
     * successful.
     */
    void updateMappingsIfNeeded(Engine.Index operation, ShardId shardId, String type) throws Exception;
}
