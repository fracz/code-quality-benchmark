// original filename: 00032714.txt
// after
public class Class00000463Better {
    @Override
    public Predicate<? super Entry<K, V>> entryPredicate() {
        return Maps.keyPredicateOnEntries(keyPredicate);
    }
}
