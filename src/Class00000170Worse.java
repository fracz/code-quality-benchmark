// original filename: 00052268.txt
// before
public class Class00000170Worse {
    @Override
    protected void skipBetweenTableAndWhere() {
        if (getLexer().skipIfEqual(Token.USING)) {
            while (true) {
                getExprParser().name();
                if (getLexer().equalToken(Token.COMMA)) {
                    getLexer().nextToken();
                    continue;
                }
                break;
            }
        }
    }
}
