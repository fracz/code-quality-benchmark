// original filename: 00039782.txt
// before
public class Class00000502Better {
    @Override
    public IndexDescriptor indexGetForLabelAndPropertyKey(int labelId, int propertyKey) {
        return descriptor(schemaStorage.indexRule(labelId, propertyKey));
    }
}
