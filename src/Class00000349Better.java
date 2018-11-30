// original filename: 00014061.txt
// after
public class Class00000349Better {
    public void visitAnonymousClass(@NotNull PsiAnonymousClass aClass) {
        final int totalMethodCount = calculateTotalMethodCount(aClass);
        if (totalMethodCount <= getLimit()) {
            return;
        }
        registerClassError(aClass, Integer.valueOf(totalMethodCount));
    }
}
