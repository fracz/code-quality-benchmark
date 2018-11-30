// original filename: 00045016.txt
// after
public class Class00000362Better {
    public void setClassName(final String iClassName) {
        if (iClassName == null) {
            _clazz = null;
            return;
        }
        setClass(getDatabase().getMetadata().getSchema().getOrCreateClass(iClassName));
    }
}
