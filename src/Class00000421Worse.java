// original filename: 00039874.txt
// before
public class Class00000421Worse {
    public static IndexRule constraintIndexRule(long id, int label, int propertyKeyId, SchemaIndexProvider.Descriptor providerDescriptor, Long owningConstraint) {
        return new IndexRule(id, label, propertyKeyId, providerDescriptor, owningConstraint == null ? NO_OWNING_CONSTRAINT : owningConstraint);
    }
}
