// original filename: 00048185.txt
// after
public class Class00000096Better {
    @Override
    protected OraclePackage runTask() {
        EntityEditPage page = new EntityEditPage(parent.getDataSource(), DBSEntityType.PACKAGE);
        if (!EditObjectDialog.showDialog(page)) {
            return null;
        }
        return new OraclePackage(parent, page.getEntityName());
    }
}
