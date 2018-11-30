// original filename: 00047685.txt
// before
public class Class00000081Worse {
    @Override
    public Future<Boolean> removeAllAsync(Collection<?> c) {
        return commandExecutor.evalWriteAsync(getName(), codec, RedisCommands.EVAL_BOOLEAN_WITH_VALUES, "local v = 0 " + "for i = 1, #ARGV, 1 do " + "if redis.call('srem', KEYS[1], ARGV[i]) == 1 " + "then v = 1 end " + "end " + "return v ", Collections.<Object>singletonList(getName()), c.toArray());
    }
}
