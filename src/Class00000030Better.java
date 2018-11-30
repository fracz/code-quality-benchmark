// original filename: 00050220.txt
// after
public class Class00000030Better {
    @Override
    protected OracleProcedureStandalone runTask() {
        CreateProcedurePage editPage = new CreateProcedurePage(parent);
        if (!editPage.edit()) {
            return null;
        }
        return new OracleProcedureStandalone(parent, editPage.getProcedureName(), editPage.getProcedureType());
    }
}
