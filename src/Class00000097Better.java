// original filename: 00041432.txt
// after
public class Class00000097Better {
    public Iterator<TYPE> iterator() {
        return new OLazyObjectIterator<TYPE>(database, list.iterator());
    }
}
