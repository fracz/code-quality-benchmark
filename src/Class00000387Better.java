// original filename: 00031165.txt
// after
public class Class00000387Better {
    @Override
    public InternalAggregation buildAggregation(long bucket) {
        if (valuesSource == null || bucket >= maxes.size()) {
            return buildEmptyAggregation();
        }
        return new InternalMax(name, maxes.get(bucket), formatter, metaData());
    }
}
