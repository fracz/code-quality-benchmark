// original filename: 00053265.txt
// before
public class Class00000630Better {
    @Override
    public void addBatch() throws SQLException {
        for (PreparedStatement each : routedStatements) {
            each.addBatch();
        }
    }
}
