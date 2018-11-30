// original filename: 00032714.txt
// before
public class Class00000463Worse {
    @Override
    public Predicate<? super Entry<K, V>> entryPredicate() {
        return new Maps.KeyPredicate<K, V>(keyPredicate);
    }
}
