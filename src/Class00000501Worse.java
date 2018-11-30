// original filename: 00018375.txt
// after
public class Class00000501Worse {
    @Override
    public void subscribe(Subscriber<? super T> s) {
        if (ACTUAL.compareAndSet(this, null, s)) {
            s.onSubscribe(this);
        } else {
            EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), s);
        }
    }
}
