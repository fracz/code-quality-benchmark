// original filename: 00053009.txt
// after
public class Class00000521Worse {
    @Override
    protected OracleInsertStatement createSQLInsertStatement() {
        OracleInsertStatement result = new OracleInsertStatement();
        result.getHints().addAll(getExprParser().parseHints());
        return result;
    }
}
