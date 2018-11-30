// original filename: 00039223.txt
// before
public class Class00000258Worse {
    @Before
    public synchronized void startGraphDb() {
        graphDb = new EmbeddedGraphDatabase("target" + File.separator + "var" + File.separator + ManagementBeansTest.class.getSimpleName());
        xaManager = graphDb.getSingleManagementBean(XaManager.class);
    }
}
