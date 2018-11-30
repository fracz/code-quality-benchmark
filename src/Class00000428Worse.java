// original filename: 00028220.txt
// before
public class Class00000428Worse {
    @Override
    public String setValue(String value) {
        if (value == null) {
            throw new NullPointerException("value");
        }
        String oldValue = this.value;
        this.value = value;
        return oldValue;
    }
}
