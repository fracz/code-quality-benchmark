// original filename: 00026540.txt
// before
public class Class00000278Worse {
    @Override
    public Selectable links() {
        XsoupSelector xpathSelector = new XsoupSelector("//a/@href");
        return selectList(xpathSelector, strings);
    }
}
