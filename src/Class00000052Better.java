// original filename: 00040020.txt
// after
public class Class00000052Better {
    @Override
    public NodePropertyExistenceConstraint nodePropertyExistenceConstraintCreate(NodePropertyDescriptor descriptor) throws CreateConstraintFailureException, AlreadyConstrainedException {
        statement.assertOpen();
        return schemaWrite().nodePropertyExistenceConstraintCreate(statement, descriptor);
    }
}
