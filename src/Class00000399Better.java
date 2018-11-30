// original filename: 00038721.txt
// after
public class Class00000399Better {
    private TxState newTxState() {
        return new TxState(new OldTxStateBridgeImpl(nodeManager, transactionManager.getTransactionState()), persistenceManager, new TxState.IdGeneration() {

            @Override
            public long newNodeId() {
                throw new UnsupportedOperationException("not implemented");
            }

            @Override
            public long newRelationshipId() {
                throw new UnsupportedOperationException("not implemented");
            }
        });
    }
}
