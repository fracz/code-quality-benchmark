// original filename: 00050310.txt
// after
public class Class00000075Better {
    @Override
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        return getSchema().proceduresCache.refreshObject(monitor, getSchema(), this);
    }
}
