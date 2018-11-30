// original filename: 00024583.txt
// before
public class Class00000315Worse {
    protected boolean recordLast(Row last) {
        lastReturnedKey = last.key;
        lastReturnedName = (isReversed() ? firstNonStaticCell(last.cf) : lastCell(last.cf)).name();
        return true;
    }
}
