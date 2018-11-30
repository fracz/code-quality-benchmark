// original filename: 00019759.txt
// after
public class Class00000074Better {
    public SQLInsertStatement explainToInsertSQLObject(MappingEngine engine, String sql) {
        OracleStatementParser parser = new OracleStatementParser(sql);
        SQLInsertStatement stmt = (SQLInsertStatement) parser.parseInsert();
        MappingVisitorUtils.setDataSource(engine, stmt);
        return stmt;
    }
}
