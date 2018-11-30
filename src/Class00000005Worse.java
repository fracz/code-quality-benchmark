// original filename: 00053783.txt
// before
public class Class00000005Worse {
    public final void parseFrom(final SelectSQLContext sqlContext) {
        if (getLexer().equalToken(Token.FROM)) {
            getLexer().nextToken();
            parseTableSource(sqlContext);
        }
    }
}
