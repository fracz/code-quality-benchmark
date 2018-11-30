// original filename: 00039729.txt
// after
public class Class00000240Better {
    @Override
    public void incrementIndexUpdates(IndexDescriptor descriptor, long delta) {
        counts(indexStatisticsKey(descriptor)).increment(delta, 0L);
    }
}
