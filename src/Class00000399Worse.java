// original filename: 00038721.txt
// before
public class Class00000399Worse {
    private TxState newTxState() {
        return new TxState(new OldTxStateBridgeImpl(nodeManager, transactionManager.getTransactionState()), persistenceManager, new TxState.IdGeneration() {

            @Override
            public long newSchemaRuleId() {
                return neoStore.getSchemaStore().nextId();
            }
        }, providerMap);
    }
}
