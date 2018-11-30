// original filename: 00052268.txt
// after
public class Class00000170Better {
    @Override
    protected void skipBetweenTableAndWhere() {
        if (getLexer().skipIfEqual(Token.USING)) {
            do {
                getLexer().nextToken();
                if (getLexer().skipIfEqual(Token.DOT)) {
                    getLexer().nextToken();
                }
            } while (getLexer().equalToken(Token.COMMA));
        }
    }
}
