// original filename: 00014061.txt
// before
public class Class00000349Worse {
    public void visitAnonymousClass(@NotNull PsiAnonymousClass aClass) {
        final int totalMethodCount = calculateTotalMethodCount(aClass);
        if (totalMethodCount <= getLimit()) {
            return;
        }
        final PsiJavaCodeReferenceElement classNameIdentifier = aClass.getBaseClassReference();
        registerError(classNameIdentifier);
    }
}
