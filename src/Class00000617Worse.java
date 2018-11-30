// original filename: 00053919.txt
// after
public class Class00000617Worse {
    private void skipQueryPartitionClause() {
        if (!getSqlParser().skipIfEqual(OracleKeyword.PARTITION)) {
            return;
        }
        getSqlParser().accept(DefaultKeyword.BY);
        if (!getSqlParser().equalAny(Symbol.LEFT_PAREN)) {
            throw new UnsupportedOperationException("Cannot support PARTITION BY without ()");
        }
        getSqlParser().skipParentheses();
    }
}
