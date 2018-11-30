// original filename: 00045303.txt
// after
public class Class00000165Better {
    @Override
    public void release(long fileId, long pageIndex) {
        LRUEntry lruEntry = get(fileId, pageIndex);
        if (lruEntry != null)
            lruEntry.usageCounter--;
        else
            throw new IllegalStateException("record should be released is already free!");
    }
}
