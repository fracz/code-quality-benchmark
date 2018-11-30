// original filename: 00048179.txt
// after
public class Class00000235Better {
    @Override
    protected DB2Sequence runTask() {
        EntityEditPage page = new EntityEditPage(schema.getDataSource(), DBSEntityType.SEQUENCE);
        if (!EditObjectDialog.showDialog(page)) {
            return null;
        }
        return new DB2Sequence(schema, page.getEntityName());
    }
}
