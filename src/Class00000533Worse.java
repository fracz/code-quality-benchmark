// original filename: 00048621.txt
// after
public class Class00000533Worse {
    @Override
    void dispose(boolean reflect) {
        for (DBNProject project : projects) {
            project.dispose(reflect);
        }
        projects = new DBNProject[0];
        model.getApplication().getProjectManager().removeProjectListener(this);
    }
}
