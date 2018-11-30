// original filename: 00051721.txt
// before
public class Class00000484Better {
    @Override
    public DBCSession openIsolatedContext(DBRProgressMonitor monitor, DBCExecutionPurpose purpose, String task) {
        // Isolated connections doesn't make sense in WMI
        return openSession(monitor, purpose, task);
    }
}
