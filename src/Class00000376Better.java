// original filename: 00053177.txt
// after
public class Class00000376Better {
    @Override
    protected void customizedSelect(final SQLSelect sqlSelect) {
        if (getLexer().equalToken(Token.FOR)) {
            parseForUpdate();
        }
        if (getSqlContext().getOrderByContexts().isEmpty()) {
            getSqlContext().getOrderByContexts().addAll(getExprParser().parseOrderBy());
        }
    }
}
