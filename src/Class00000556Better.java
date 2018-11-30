// original filename: 00038753.txt
// before
public class Class00000556Better {
    @Override
    public synchronized void commit() throws RollbackException, HeuristicMixedException, HeuristicRollbackException, IllegalStateException, SystemException {
        // make sure tx not suspended
        txManager.commit();
        transactionContext.commit();
    }
}
