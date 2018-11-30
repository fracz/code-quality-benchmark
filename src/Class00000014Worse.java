// original filename: 00040021.txt
// before
public class Class00000014Worse {
    @Override
    public RelationshipPropertyExistenceConstraint relationshipPropertyExistenceConstraintCreate(int relTypeId, int propertyKeyId) throws CreateConstraintFailureException, AlreadyConstrainedException {
        statement.assertOpen();
        return schemaWrite().relationshipPropertyExistenceConstraintCreate(statement, relTypeId, propertyKeyId);
    }
}
