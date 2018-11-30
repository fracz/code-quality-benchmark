// original filename: 00047685.txt
// after
public class Class00000081Better {
    @Override
    public Future<Boolean> removeAllAsync(Collection<?> c) {
        if (c.isEmpty()) {
            return newSucceededFuture(false);
        }
        return commandExecutor.writeAsync(getName(), codec, RedisCommands.SREM_SINGLE, getName(), c.toArray());
    }
}
