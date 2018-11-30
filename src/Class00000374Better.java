// original filename: 00059733.txt
// after
public class Class00000374Better {
    private StoreTransaction overrideTimestamp(final StoreTransaction tx, final Timepoint t) throws StorageException {
        StandardTransactionConfig newCfg = new StandardTransactionConfig.Builder(tx.getConfiguration()).timestamp(t).build();
        return manager.beginTransaction(newCfg);
    }
}
