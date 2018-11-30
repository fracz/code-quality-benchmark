// original filename: 00006616.txt
// after
public class Class00000404Better {
    @NotNull
    private static PsiElement getTargetElement(Extension e) {
        DomTarget extensionTarget = DomTarget.getTarget(e);
        if (extensionTarget != null) {
            return PomService.convertToPsi(extensionTarget);
        }
        // shouldn't happen, fallback for additional safety
        return e.getXmlTag();
    }
}
