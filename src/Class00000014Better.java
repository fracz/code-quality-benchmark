// original filename: 00040021.txt
// after
public class Class00000014Better {
    @Override
    public RelationshipPropertyExistenceConstraint relationshipPropertyExistenceConstraintCreate(RelationshipPropertyDescriptor descriptor) throws CreateConstraintFailureException, AlreadyConstrainedException {
        statement.assertOpen();
        return schemaWrite().relationshipPropertyExistenceConstraintCreate(statement, descriptor);
    }
}
