// original filename: 00026415.txt
// after
public class Class00000206Better {
    /**
     * {@inheritDoc}
     */
    @Override
    public void setTransactionIsolation(int level) throws SQLException {
        delegate.setTransactionIsolation(level);
        poolEntry.setTransactionIsolation(level);
        isConnectionStateDirty = true;
    }
}
