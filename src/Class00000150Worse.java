// original filename: 00011390.txt
// before
public class Class00000150Worse {
    public String getNodeName() {
        final DomElementPresentation presentation = myDomElement.getPresentation();
        if (presentation != null && presentation.getPresentationName() != null) {
            return presentation.getPresentationName();
        }
        return getPropertyName();
    }
}
