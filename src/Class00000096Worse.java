// original filename: 00048185.txt
// before
public class Class00000096Worse {
    @Override
    protected OraclePackage runTask() {
        CreateEntityDialog dialog = new CreateEntityDialog(DBeaverUI.getActiveWorkbenchShell(), parent.getDataSource(), OracleMessages.edit_oracle_package_manager_dialog_title);
        if (dialog.open() != IDialogConstants.OK_ID) {
            return null;
        }
        return new OraclePackage(parent, dialog.getEntityName());
    }
}
