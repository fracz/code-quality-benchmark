// original filename: 00059228.txt
// before
public class Class00000204Worse {
    /* ################################################
                    Utility Functions
        ################################################### */
    private static ExternalIndexType getExternalIndex(String indexName, ElementCategory elementCategory, StandardTitanTx tx) {
        String indexLookupName = ExternalIndexTypeWrapper.getExternalIndexName(indexName, elementCategory);
        // retrieve actual index from transaction
        ExternalIndexType index = null;
        Preconditions.checkArgument(index != null, "There is no index [%s] installed for element category [%s]", indexName, elementCategory);
        return index;
    }
}
