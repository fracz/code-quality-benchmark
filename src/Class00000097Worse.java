// original filename: 00041432.txt
// before
public class Class00000097Worse {
    public Iterator<TYPE> iterator() {
        return new OLazyObjectIterator<TYPE>(database, (Iterator<ODocument>) super.iterator());
    }
}
