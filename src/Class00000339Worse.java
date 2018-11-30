// original filename: 00054547.txt
// before
public class Class00000339Worse {
    public void accept(Token token) {
        if (getLexer().equalToken(token)) {
            getLexer().nextToken();
        } else {
            throw new ParserException("syntax error, expect " + token + ", actual " + getLexer().getToken() + " " + getLexer().getLiterals());
        }
    }
}
