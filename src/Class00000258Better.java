// original filename: 00039223.txt
// after
public class Class00000258Better {
    @Before
    public synchronized void startGraphDb() {
        graphDb = new EmbeddedGraphDatabase(dir.directory("test").getAbsolutePath());
        xaManager = graphDb.getSingleManagementBean(XaManager.class);
    }
}
