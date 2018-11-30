// original filename: 00017686.txt
// after
public class Class00000184Better {
    public static boolean isSubclass(@NotNull ClassDescriptor subClass, @NotNull ClassDescriptor superClass) {
        return isSubtypeOfClass(subClass.getDefaultType(), superClass.getOriginal());
    }
}
