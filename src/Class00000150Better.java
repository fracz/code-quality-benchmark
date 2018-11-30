// original filename: 00011390.txt
// after
public class Class00000150Better {
    public String getNodeName() {
        final String name = myDomElement.getPresentation().getElementName();
        return name != null ? name : getPropertyName();
    }
}
