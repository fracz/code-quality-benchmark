// original filename: 00030091.txt
// after
public class Class00000355Better {
    @Override
    protected Fieldable parseCreateField(ParseContext context) throws IOException {
        if (!enabled) {
            return null;
        }
        return new CustomIntegerNumericField(this, context.source().length);
    }
}
