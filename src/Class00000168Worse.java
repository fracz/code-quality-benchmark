// original filename: 00025275.txt
// before
public class Class00000168Worse {
    @Override
    public KeyValueIterator<K, V> all() {
        return new MeteredKeyValueIterator<>(this.inner.all(), this.allTime);
    }
}
