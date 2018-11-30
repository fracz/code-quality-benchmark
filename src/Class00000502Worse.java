// original filename: 00039782.txt
// after
public class Class00000502Worse {
    @Override
    public IndexDescriptor indexGetForLabelAndPropertyKey(NodePropertyDescriptor descriptor) {
        return descriptor(schemaStorage.indexRule(descriptor));
    }
}
