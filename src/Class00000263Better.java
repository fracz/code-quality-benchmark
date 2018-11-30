// original filename: 00059097.txt
// after
public class Class00000263Better {
    @Override
    public Long next() throws StorageException {
        if (!hasNext())
            throw new NoSuchElementException();
        Long result = next;
        next = null;
        return result;
    }
}
