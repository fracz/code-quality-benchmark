// original filename: 00030639.txt
// before
public class Class00000148Worse {
    /**
     * Determine if any mappings need to be updated, and update them on the
     * master node if necessary. Returnes a failed {@code Engine.IndexResult}
     * in the event updating the mappings fails or null if successful.
     * Throws a {@code ReplicationOperation.RetryOnPrimaryException} if the
     * operation needs to be retried on the primary due to the mappings not
     * being present yet, or a different exception if updating the mappings
     * on the master failed.
     */
    @Nullable
    MappingUpdateResult updateMappingsIfNeeded(IndexShard primary, IndexRequest request) throws Exception;
}
