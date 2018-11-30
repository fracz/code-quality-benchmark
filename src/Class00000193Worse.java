// original filename: 00040152.txt
// before
public class Class00000193Worse {
    @Override
    public NodePropertyExistenceConstraint nodePropertyExistenceConstraintCreate(KernelStatement state, int labelId, int propertyKeyId) throws CreateConstraintFailureException {
        NodePropertyExistenceConstraint constraint = new NodePropertyExistenceConstraint(labelId, propertyKeyId);
        state.txState().constraintDoAdd(constraint);
        return constraint;
    }
}
