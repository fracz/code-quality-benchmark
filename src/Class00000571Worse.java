// original filename: 00000987.txt
// after
public class Class00000571Worse {
    @Nullable
    public String error() {
        return Streams.concat(stream(dataAdapter().getError()), stream(cache().getError())).map(Throwable::getMessage).collect(Collectors.joining("\n"));
    }
}
