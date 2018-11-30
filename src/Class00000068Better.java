// original filename: 00059779.txt
// after
public class Class00000068Better {
    public void open() throws StorageException {
        index = openIndex();
        tx = new IndexTransaction(index, indexRetriever, 2, new SimpleDuration(1000L, TimeUnit.MILLISECONDS));
    }
}
