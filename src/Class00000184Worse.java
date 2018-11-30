// original filename: 00017686.txt
// before
public class Class00000184Worse {
    public static boolean isSubclass(@NotNull ClassDescriptor subClass, @NotNull ClassDescriptor superClass) {
        DeclarationDescriptor superOriginal = superClass.getOriginal();
        return hasEqualSuperType(subClass.getDefaultType(), superOriginal);
    }
}
