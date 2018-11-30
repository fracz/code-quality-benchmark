// original filename: 00040152.txt
// after
public class Class00000193Better {
    @Override
    public NodePropertyExistenceConstraint nodePropertyExistenceConstraintCreate(KernelStatement state, NodePropertyDescriptor descriptor) throws CreateConstraintFailureException {
        NodePropertyExistenceConstraint constraint = new NodePropertyExistenceConstraint(descriptor);
        state.txState().constraintDoAdd(constraint);
        return constraint;
    }
}
