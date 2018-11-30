// original filename: 00031165.txt
// before
public class Class00000387Worse {
    @Override
    public InternalAggregation buildAggregation(long owningBucketOrdinal) {
        if (valuesSource == null) {
            return new InternalMax(name, Double.NEGATIVE_INFINITY, formatter, metaData());
        }
        assert owningBucketOrdinal < maxes.size();
        return new InternalMax(name, maxes.get(owningBucketOrdinal), formatter, metaData());
    }
}
