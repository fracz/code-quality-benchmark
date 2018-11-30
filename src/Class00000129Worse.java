// original filename: 00042817.txt
// before
public class Class00000129Worse {
    public OClass createEdgeType(final String iClassName) {
        OClass cls = getMetadata().getSchema().createClass(iClassName).setSuperClass(getMetadata().getSchema().getClass(EDGE_CLASS_NAME));
        getMetadata().getSchema().save();
        return cls;
    }
}
