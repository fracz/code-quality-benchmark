// original filename: 00020228.txt
// before
public class Class00000620Better {
    public SQLSelectStatement parseSelect() {
        OdpsSelectParser selectParser = new OdpsSelectParser(this.exprParser);
        return new SQLSelectStatement(selectParser.select(), JdbcConstants.ODPS);
    }
}
