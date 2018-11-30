// original filename: 00047499.txt
// before
public class Class00000146Worse {
    @Override
    public Publisher<Boolean> fastPut(K key, V value) {
        return commandExecutor.writeReactive(getName(), codec, RedisCommands.HSET, getName(), key, value);
    }
}
