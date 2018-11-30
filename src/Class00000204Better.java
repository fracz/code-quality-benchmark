// original filename: 00059228.txt
// after
public class Class00000204Better {
    /* ################################################
                    Utility Functions
        ################################################### */
    private static final ExternalIndexType getExternalIndex(String indexName, StandardTitanTx transaction) {
        IndexType index = ManagementSystem.getInternalGraphIndex(indexName, transaction);
        Preconditions.checkArgument(index.isExternalIndex());
        return (ExternalIndexType) index;
    }
}
