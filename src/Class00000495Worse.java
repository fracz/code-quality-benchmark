// original filename: 00018499.txt
// after
public class Class00000495Worse {
    public static <T> Observable<T> create(NbpOnSubscribe<T> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        // TODO plugin wrapper
        return new Observable<T>(onSubscribe);
    }
}
