// original filename: 00018499.txt
// before
public class Class00000495Better {
    @BackpressureSupport(BackpressureKind.NONE)
    @SchedulerSupport(SchedulerKind.NONE)
    public static <T> Observable<T> create(Publisher<T> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        onSubscribe = RxJavaPlugins.onCreate(onSubscribe);
        return new Observable<T>(onSubscribe);
    }
}
