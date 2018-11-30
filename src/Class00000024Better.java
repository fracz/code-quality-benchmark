// original filename: 00047595.txt
// after
public class Class00000024Better {
    @Override
    public Publisher<Integer> size() {
        return reactive(new Supplier<RFuture<Integer>>() {

            @Override
            public RFuture<Integer> get() {
                return instance.sizeAsync();
            }
        });
    }
}
