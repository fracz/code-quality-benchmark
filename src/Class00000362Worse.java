// original filename: 00045016.txt
// before
public class Class00000362Worse {
    public void setClassName(final String iClassName) {
        if (_database == null || iClassName == null) {
            _clazz = null;
            return;
        }
        setClass(_database.getMetadata().getSchema().getOrCreateClass(iClassName));
    }
}
