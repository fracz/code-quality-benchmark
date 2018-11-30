// original filename: 00019760.txt
// after
public class Class00000032Better {
    public SQLUpdateStatement explainToUpdateSQLObject(MappingEngine engine, String sql) {
        OracleStatementParser parser = new OracleStatementParser(sql);
        SQLUpdateStatement stmt = parser.parseUpdateStatement();
        MappingVisitorUtils.setDataSource(engine, stmt);
        return stmt;
    }
}
