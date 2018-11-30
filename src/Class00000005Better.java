// original filename: 00053783.txt
// after
public class Class00000005Better {
    public final void parseFrom(final SelectSQLContext sqlContext) {
        if (getExprParser().getLexer().skipIfEqual(Token.FROM)) {
            parseTableSource(sqlContext);
        }
    }
}
