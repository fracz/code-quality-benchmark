// original filename: 00060090.txt
// before
public class Class00000103Worse {
    public void open() {
        GraphDatabaseConfiguration config = new GraphDatabaseConfiguration(homeDir);
        graphdb = config.openDatabase();
        tx = graphdb.startTransaction();
    }
}
