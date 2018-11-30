// original filename: 00040138.txt
// after
public class Class00000391Better {
    @Override
    public void validateRelationshipPropertyExistenceConstraint(Cursor<RelationshipItem> allRels, RelationshipPropertyDescriptor descriptor) throws CreateConstraintFailureException {
        throw propertyExistenceConstraintsNotAllowed(new RelationshipPropertyExistenceConstraint(descriptor));
    }
}
