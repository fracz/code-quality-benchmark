// original filename: 00039326.txt
// after
public class Class00000182Better {
    private BatchTransactionApplier newApplier(boolean recovery) {
        BatchTransactionApplier applier = new NeoStoreBatchTransactionApplier(neoStores, cacheAccess, lockService);
        if (recovery) {
            applier = newApplierFacade(new HighIdBatchTransactionApplier(neoStores), applier, new CacheInvalidationBatchTransactionApplier(neoStores, cacheAccess));
        }
        return applier;
    }
}
