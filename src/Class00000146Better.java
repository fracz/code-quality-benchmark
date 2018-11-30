// original filename: 00047499.txt
// after
public class Class00000146Better {
    @Override
    public Publisher<Boolean> fastPut(K key, V value) {
        return reactive(instance.fastPutAsync(key, value));
    }
}
