// original filename: 00021316.txt
// before
public class Class00000143Worse {
    public final String stringDefaultValue() {
        if (this.isEnabled(Feature.InitStringFieldAsEmpty)) {
            return "";
        }
        return null;
    }
}
