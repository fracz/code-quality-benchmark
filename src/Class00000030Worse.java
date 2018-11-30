// original filename: 00050220.txt
// before
public class Class00000030Worse {
    @Override
    protected OracleProcedureStandalone runTask() {
        CreateProcedureDialog dialog = new CreateProcedureDialog(DBeaverUI.getActiveWorkbenchShell(), parent.getDataSource());
        if (dialog.open() != IDialogConstants.OK_ID) {
            return null;
        }
        return new OracleProcedureStandalone(parent, dialog.getProcedureName(), dialog.getProcedureType());
    }
}
