// original filename: 00047592.txt
// before
public class Class00000494Better {
    @Override
    public Publisher<Integer> removeRangeByRank(int startIndex, int endIndex) {
        return commandExecutor.writeReactive(getName(), codec, RedisCommands.ZREMRANGEBYRANK, getName(), startIndex, endIndex);
    }
}
