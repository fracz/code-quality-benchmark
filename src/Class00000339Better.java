// original filename: 00054547.txt
// after
public class Class00000339Better {
    @Override
    public void accept(final Token token) {
        if (getLexer().equalToken(token)) {
            getLexer().nextToken();
        } else {
            throw new ParserException(getLexer(), token);
        }
    }
}
