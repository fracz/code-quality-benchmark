// original filename: 00047595.txt
// before
public class Class00000024Worse {
    @Override
    public Publisher<Long> size() {
        return commandExecutor.readReactive(getName(), codec, RedisCommands.ZCARD, getName());
    }
}
