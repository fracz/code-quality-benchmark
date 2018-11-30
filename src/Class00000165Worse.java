// original filename: 00045303.txt
// before
public class Class00000165Worse {
    @Override
    public void release(long fileId, long pageIndex) {
        LRUEntry lruEntry = get(fileId, pageIndex);
        if (lruEntry != null) {
            lruEntry.usageCounter.decrementAndGet();
        } else {
            // TODO replace with correct exception
            throw new RuntimeException("record should be released is already free!");
        }
    }
}
