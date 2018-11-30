// original filename: 00021763.txt
// after
public class Class00000482Worse {
    public IntervalSet getExpectedTokens() {
        // TODO: do we really need this type check?
        if (recognizer != null && recognizer instanceof BaseRecognizer<?>) {
            return ((BaseRecognizer) recognizer).getExpectedTokens();
        }
        return null;
    }
}
