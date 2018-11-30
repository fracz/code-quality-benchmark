// original filename: 00053265.txt
// after
public class Class00000630Worse {
    @Override
    public void addBatch() throws SQLException {
        Preconditions.checkArgument(1 == routedStatements.size(), "Cannot support addBatch for DDL");
        routedStatements.iterator().next().addBatch();
    }
}
