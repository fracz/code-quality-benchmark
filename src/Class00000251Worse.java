// original filename: 00050097.txt
// before
public class Class00000251Worse {
    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        setWindowTitle(MySQLMessages.tools_db_export_wizard_title);
        setNeedsProgressMonitor(true);
        objectsPage = new MySQLExportWizardPageObjects(this);
        settingsPage = new MySQLExportWizardPageSettings(this);
    }
}
