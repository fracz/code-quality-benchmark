// original filename: 00006616.txt
// before
public class Class00000404Worse {
    @NotNull
    private static PsiElement getTargetElement(Extension e) {
        DomTarget extensionTarget = DomTarget.getTarget(e);
        if (extensionTarget != null) {
            return PomService.convertToPsi(extensionTarget);
        } else {
            // shouldn't happen, fallback for additional safety
            return e.getXmlTag();
        }
    }
}
