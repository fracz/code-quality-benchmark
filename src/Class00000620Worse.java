// original filename: 00020228.txt
// after
public class Class00000620Worse {
    public SQLSelectStatement parseSelect() {
        return new SQLSelectStatement(new OdpsSelectParser(this.exprParser).select(), JdbcConstants.ODPS);
    }
}
