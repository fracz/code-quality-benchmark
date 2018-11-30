// original filename: 00017929.txt
// after
public class Class00000093Better {
    @Override
    @After
    public void tearDown() throws Exception {
        if (jersey2HttpClient != null) {
            jersey2HttpClient.shutdown();
        }
        super.tearDown();
    }
}
