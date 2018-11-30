// original filename: 00019759.txt
// before
public class Class00000074Worse {
    public SQLInsertStatement explainToInsertSQLObject(MappingEngine engine, String sql) {
        OracleStatementParser parser = new OracleStatementParser(sql);
        return (SQLInsertStatement) parser.parseInsert();
    }
}
