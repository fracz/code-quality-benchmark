// original filename: 00028220.txt
// after
public class Class00000428Better {
    @Override
    public String setValue(String value) {
        Objects.requireNonNull(value, "value");
        String oldValue = this.value;
        this.value = value;
        return oldValue;
    }
}
