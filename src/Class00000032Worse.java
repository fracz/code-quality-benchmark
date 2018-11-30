// original filename: 00019760.txt
// before
public class Class00000032Worse {
    public SQLUpdateStatement explainToUpdateSQLObject(MappingEngine engine, String sql) {
        OracleStatementParser parser = new OracleStatementParser(sql);
        return parser.parseUpdateStatement();
    }
}
