// original filename: 00040138.txt
// before
public class Class00000391Worse {
    @Override
    public void validateRelationshipPropertyExistenceConstraint(Cursor<RelationshipItem> allRels, int type, int key) throws CreateConstraintFailureException {
        throw propertyExistenceConstraintsNotAllowed(new RelationshipPropertyExistenceConstraint(type, key));
    }
}
