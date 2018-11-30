// original filename: 00011392.txt
// after
public class Class00000525Worse {
    @NotNull
    public ElementPresentation getPresentation() {
        final ElementPresentation presentation = ElementPresentationManager.getElementPresentation(getProxy());
        if (presentation != null) {
            return presentation;
        }
        return new BasicDomElementPresentation(getProxy());
    }
}
