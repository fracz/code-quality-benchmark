// original filename: 00038753.txt
// after
public class Class00000556Worse {
    @Override
    public synchronized void commit() throws RollbackException, HeuristicMixedException, HeuristicRollbackException, IllegalStateException, SystemException {
        // make sure tx not suspended
        try {
            transactionContext.commit();
        } catch (TransactionFailureException e) {
            throw e.unBoxed();
        }
    }
}
