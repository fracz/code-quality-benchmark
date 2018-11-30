// original filename: 00017929.txt
// before
public class Class00000093Worse {
    @After
    public void tearDown() throws Exception {
        reset(requestHandler);
        if (jersey2HttpClient != null) {
            jersey2HttpClient.shutdown();
        }
    }
}
