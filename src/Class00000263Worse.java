// original filename: 00059097.txt
// before
public class Class00000263Worse {
    @Override
    public Long next() throws StorageException {
        if (next == null)
            next = nextInternal();
        if (next == null)
            throw new NoSuchElementException();
        Long result = next;
        next = null;
        return result;
    }
}
