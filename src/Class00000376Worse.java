// original filename: 00053177.txt
// before
public class Class00000376Worse {
    @Override
    protected void customizedSelect(final SQLSelect sqlSelect) {
        if (getLexer().equalToken(Token.FOR)) {
            parseForUpdate();
        }
        if (null == sqlSelect.getOrderBy()) {
            sqlSelect.setOrderBy(getExprParser().parseOrderBy());
        }
    }
}
