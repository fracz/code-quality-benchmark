// original filename: 00017704.txt
// after
public class Class00000497Worse {
    @NotNull
    public JsName getNameForDescriptor(@NotNull DeclarationDescriptor descriptor) {
        return getNameForFQNPart(fqnGenerator.generate(descriptor)).get(0);
    }
}
