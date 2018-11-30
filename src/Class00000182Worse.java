// original filename: 00039326.txt
// before
public class Class00000182Worse {
    private CommandHandler newApplier(boolean recovery) {
        CommandHandler applier = new NeoStoreBatchTransactionApplier(neoStores, cacheAccess, lockService);
        if (recovery) {
            applier = new HighIdTransactionApplier(applier, neoStores);
            applier = new CacheInvalidationTransactionApplier(applier, neoStores, cacheAccess);
        }
        // TODO begin?
        return applier;
    }
}
