// original filename: 00047592.txt
// after
public class Class00000494Worse {
    @Override
    public Publisher<Integer> removeRangeByRank(final int startIndex, final int endIndex) {
        return reactive(new Supplier<RFuture<Integer>>() {

            @Override
            public RFuture<Integer> get() {
                return instance.removeRangeByRankAsync(startIndex, endIndex);
            }
        });
    }
}
