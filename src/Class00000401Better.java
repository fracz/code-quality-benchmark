// original filename: 00015954.txt
// after
public class Class00000401Better {
    /*package*/
    void putScope(@NotNull DeclarationDescriptor descriptor, @NotNull NamingScope scope) {
        assert !descriptorToScopeMap.containsKey(descriptor) : "Already contains that key!";
        descriptorToScopeMap.put(descriptor, scope);
    }
}
