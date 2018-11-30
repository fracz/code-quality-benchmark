// original filename: 00052082.txt
// after
public class Class00000066Better {
    @Override
    public DBCExecutionContext openIsolatedContext(DBRProgressMonitor monitor) throws DBCException {
        return new JDBCExecutionContext(this, monitor);
    }
}
