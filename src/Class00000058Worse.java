// original filename: 00058711.txt
// before
public class Class00000058Worse {
    /**
     * Returns a transaction handle for a new transaction.
     *
     * @return New Transaction Handle
     */
    @Override
    public PersistitTransaction beginTransaction(ConsistencyLevel level) throws StorageException {
        // all Exchanges created by a thread share the same transaction context
        Transaction tx = db.getTransaction();
        return new PersistitTransaction(db, tx, level);
    }
}
