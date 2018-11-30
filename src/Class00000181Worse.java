// original filename: 00040139.txt
// before
public class Class00000181Worse {
    @Override
    public PropertyConstraintRule writeNodePropertyExistenceConstraint(long ruleId, int label, int propertyKey) throws CreateConstraintFailureException {
        throw propertyExistenceConstraintsNotAllowed(new NodePropertyExistenceConstraint(label, propertyKey));
    }
}
