// original filename: 00028234.txt
// before
public class Class00000452Worse {
    @Test
    public void testListenTwice() throws Exception {
        server.requestHandler(noOpHandler());
        server.listen();
        try {
            server.listen();
            fail("Should throw exception");
        } catch (IllegalStateException e) {
            // Ok
        }
    }
}
