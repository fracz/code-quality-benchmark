// original filename: 00030091.txt
// before
public class Class00000355Worse {
    @Override
    protected Fieldable parseCreateField(ParseContext context) throws IOException {
        if (!enabled) {
            return null;
        }
        return new CustomIntegerNumericField(this, ((Number) context.externalValue()).intValue());
    }
}
