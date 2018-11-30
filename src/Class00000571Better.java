// original filename: 00000987.txt
// before
public class Class00000571Better {
    @Nullable
    public String error() {
        return dataAdapter().getError().map(Throwable::getMessage).orElse(null);
    }
}
