// original filename: 00052082.txt
// before
public class Class00000066Worse {
    @Override
    public DBCExecutionContext openIsolatedContext(DBRProgressMonitor monitor) throws DBCException {
        JDBCExecutionContext context = new JDBCExecutionContext(this);
        context.connect(monitor);
        return context;
    }
}
