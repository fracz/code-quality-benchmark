// original filename: 00059733.txt
// before
public class Class00000374Worse {
    private StoreTransaction overrideTimestamp(final StoreTransaction tx, final long ts) throws StorageException {
        StandardTransactionConfig newCfg = new StandardTransactionConfig.Builder(tx.getConfiguration(), ts).build();
        return manager.beginTransaction(newCfg);
    }
}
