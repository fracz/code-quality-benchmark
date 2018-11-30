// original filename: 00040020.txt
// before
public class Class00000052Worse {
    @Override
    public NodePropertyExistenceConstraint nodePropertyExistenceConstraintCreate(int labelId, int propertyKeyId) throws CreateConstraintFailureException, AlreadyConstrainedException {
        statement.assertOpen();
        return schemaWrite().nodePropertyExistenceConstraintCreate(statement, labelId, propertyKeyId);
    }
}
