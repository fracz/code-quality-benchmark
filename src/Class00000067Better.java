// original filename: 00040023.txt
// after
public class Class00000067Better {
    @Override
    public UniquenessConstraint uniquePropertyConstraintCreate(NodePropertyDescriptor descriptor) throws CreateConstraintFailureException, AlreadyConstrainedException, AlreadyIndexedException {
        statement.assertOpen();
        return schemaWrite().uniquePropertyConstraintCreate(statement, descriptor);
    }
}
