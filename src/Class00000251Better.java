// original filename: 00050097.txt
// after
public class Class00000251Better {
    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        super.init(workbench, selection);
        objectsPage = new MySQLExportWizardPageObjects(this);
        settingsPage = new MySQLExportWizardPageSettings(this);
    }
}
