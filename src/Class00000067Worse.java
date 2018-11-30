// original filename: 00040023.txt
// before
public class Class00000067Worse {
    @Override
    public UniquenessConstraint uniquePropertyConstraintCreate(int labelId, int propertyKeyId) throws CreateConstraintFailureException, AlreadyConstrainedException, AlreadyIndexedException {
        statement.assertOpen();
        return schemaWrite().uniquePropertyConstraintCreate(statement, labelId, propertyKeyId);
    }
}
