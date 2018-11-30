// original filename: 00039729.txt
// before
public class Class00000240Worse {
    @Override
    public void incrementIndexUpdates(int labelId, int propertyKeyId, long delta) {
        counts(indexStatisticsKey(labelId, propertyKeyId)).increment(delta, 0L);
    }
}
