// original filename: 00059921.txt
// before
public class Class00000610Better {
    @Override
    public SliceQuery inputSlice(final VertexQueryFilter inputFilter) {
        if (inputFilter.limit == 0) {
            throw new UnsupportedOperationException();
        } else {
            return DEFAULT_SLICE_QUERY;
        }
    }
}
