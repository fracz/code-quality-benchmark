// original filename: 00040137.txt
// after
public class Class00000377Better {
    @Override
    public void validateNodePropertyExistenceConstraint(Iterator<Cursor<NodeItem>> allNodes, NodePropertyDescriptor descriptor) throws CreateConstraintFailureException {
        throw propertyExistenceConstraintsNotAllowed(new NodePropertyExistenceConstraint(descriptor));
    }
}
