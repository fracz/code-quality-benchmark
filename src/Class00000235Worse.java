// original filename: 00048179.txt
// before
public class Class00000235Worse {
    @Override
    protected DB2Sequence runTask() {
        CreateEntityDialog dialog = new CreateEntityDialog(DBeaverUI.getActiveWorkbenchShell(), schema.getDataSource(), DB2Messages.edit_db2_sequence_manager_dialog_title);
        if (dialog.open() != IDialogConstants.OK_ID) {
            return null;
        }
        return new DB2Sequence(schema, dialog.getEntityName());
    }
}
