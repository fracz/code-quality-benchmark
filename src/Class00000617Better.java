// original filename: 00053919.txt
// before
public class Class00000617Better {
    private void skipQueryPartitionClause() {
        if (getSqlParser().skipIfEqual(OracleKeyword.PARTITION)) {
            getSqlParser().accept(DefaultKeyword.BY);
            if (getSqlParser().equalAny(Symbol.LEFT_PAREN)) {
                getSqlParser().skipParentheses();
            } else {
                throw new UnsupportedOperationException("Cannot support PARTITION BY without ()");
            }
        }
    }
}
