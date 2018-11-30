// original filename: 00039948.txt
// before
public class Class00000455Worse {
    @Override
    public NodePropertyExistenceConstraint nodePropertyExistenceConstraintCreate(KernelStatement state, int labelId, int propertyKeyId) throws AlreadyConstrainedException, CreateConstraintFailureException {
        acquireExclusiveSchemaLock(state);
        state.assertOpen();
        return schemaWriteDelegate.nodePropertyExistenceConstraintCreate(state, labelId, propertyKeyId);
    }
}
