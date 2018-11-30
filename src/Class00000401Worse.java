// original filename: 00015954.txt
// before
public class Class00000401Worse {
    /*package*/
    void putScope(@NotNull DeclarationDescriptor descriptor, @NotNull NamingScope scope) {
        // assert !descriptorToScopeMap.containsKey(descriptor) : "Already contains that key!";
        descriptorToScopeMap.put(descriptor, scope);
    }
}
