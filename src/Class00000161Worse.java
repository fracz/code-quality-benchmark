// original filename: 00007152.txt
// before
public class Class00000161Worse {
    private static boolean isIncludeElement(Element element) {
        if (element.getName().equals(INCLUDE) && element.getNamespace().equals(XINCLUDE_NAMESPACE)) {
            return true;
        }
        return false;
    }
}
