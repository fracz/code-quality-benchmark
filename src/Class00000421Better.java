// original filename: 00039874.txt
// after
public class Class00000421Better {
    public static IndexRule constraintIndexRule(long id, NodePropertyDescriptor descriptor, SchemaIndexProvider.Descriptor providerDescriptor, Long owningConstraint) {
        return new IndexRule(id, descriptor, providerDescriptor, owningConstraint == null ? NO_OWNING_CONSTRAINT : owningConstraint);
    }
}
