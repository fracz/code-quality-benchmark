// original filename: 00026415.txt
// before
public class Class00000206Worse {
    /**
     * {@inheritDoc}
     */
    @Override
    public void setTransactionIsolation(int level) throws SQLException {
        delegate.setTransactionIsolation(level);
        isConnectionStateDirty = true;
        isTransactionIsolationDirty = (level != bagEntry.parentPool.transactionIsolation);
    }
}
