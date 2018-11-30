// original filename: 00039948.txt
// after
public class Class00000455Better {
    @Override
    public NodePropertyExistenceConstraint nodePropertyExistenceConstraintCreate(KernelStatement state, NodePropertyDescriptor descriptor) throws AlreadyConstrainedException, CreateConstraintFailureException {
        acquireExclusiveSchemaLock(state);
        state.assertOpen();
        return schemaWriteDelegate.nodePropertyExistenceConstraintCreate(state, descriptor);
    }
}
