// original filename: 00017704.txt
// before
public class Class00000497Better {
    @NotNull
    public JsName getNameForDescriptor(@NotNull DeclarationDescriptor descriptor) {
        JsName name = names.get(descriptor.getOriginal());
        assert name != null : "Must have name for descriptor";
        return name;
    }
}
