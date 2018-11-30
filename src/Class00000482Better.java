// original filename: 00021763.txt
// before
public class Class00000482Better {
    public IntervalSet getExpectedTokens() {
        // TODO: do we really need this type check?
        if (recognizer != null && recognizer instanceof BaseRecognizer<?>) {
            return recognizer.getInterpreter().atn.nextTokens(ctx);
        }
        return null;
    }
}
