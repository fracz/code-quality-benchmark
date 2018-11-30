// original filename: 00058711.txt
// after
public class Class00000058Better {
    /**
     * Returns a transaction handle for a new transaction.
     *
     * @return New Transaction Handle
     */
    @Override
    public PersistitTransaction beginTransaction(ConsistencyLevel level) throws StorageException {
        // all Exchanges created by a thread share the same transaction context
        return new PersistitTransaction(db, level);
    }
}
