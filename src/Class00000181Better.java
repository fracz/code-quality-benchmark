// original filename: 00040139.txt
// after
public class Class00000181Better {
    @Override
    public PropertyConstraintRule writeNodePropertyExistenceConstraint(long ruleId, NodePropertyDescriptor descriptor) throws CreateConstraintFailureException {
        throw propertyExistenceConstraintsNotAllowed(new NodePropertyExistenceConstraint(descriptor));
    }
}
