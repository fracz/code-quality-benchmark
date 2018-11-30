// original filename: 00048621.txt
// before
public class Class00000533Better {
    @Override
    void dispose(boolean reflect) {
        for (DBNProject project : projects) {
            project.dispose(reflect);
        }
        projects.clear();
        model.getApplication().getProjectManager().removeProjectListener(this);
    }
}
