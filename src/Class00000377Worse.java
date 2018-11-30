// original filename: 00040137.txt
// before
public class Class00000377Worse {
    @Override
    public void validateNodePropertyExistenceConstraint(Iterator<Cursor<NodeItem>> allNodes, int label, int propertyKey) throws CreateConstraintFailureException {
        throw propertyExistenceConstraintsNotAllowed(new NodePropertyExistenceConstraint(label, propertyKey));
    }
}
