// original filename: 00042817.txt
// after
public class Class00000129Better {
    public OClass createEdgeType(final String iClassName) {
        return getMetadata().getSchema().createClass(iClassName, getMetadata().getSchema().getClass(EDGE_CLASS_NAME));
    }
}
