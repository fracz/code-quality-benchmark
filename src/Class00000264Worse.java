// original filename: 00005834.txt
// before
public class Class00000264Worse {
    public boolean isFromFuture() {
        final List<String> qName = getImportSourceQName();
        return qName != null && qName.size() == 1 && PyNames.FUTURE_MODULE.equals(qName.get(0));
    }
}
