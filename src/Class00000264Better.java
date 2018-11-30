// original filename: 00005834.txt
// after
public class Class00000264Better {
    public boolean isFromFuture() {
        final PyQualifiedName qName = getImportSourceQName();
        return qName != null && qName.matches(PyNames.FUTURE_MODULE);
    }
}
