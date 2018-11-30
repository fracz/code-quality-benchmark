// original filename: 00018375.txt
// before
public class Class00000501Better {
    @Override
    public void subscribe(Subscriber<? super T> s) {
        if (ACTUAL.compareAndSet(this, null, s)) {
            s.onSubscribe(this);
        } else {
            s.onSubscribe(EmptySubscription.INSTANCE);
            s.onError(new IllegalStateException("Only one Subscriber allowed!"));
        }
    }
}
