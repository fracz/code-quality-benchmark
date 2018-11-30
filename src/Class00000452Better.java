// original filename: 00028234.txt
// after
public class Class00000452Better {
    @Test
    public void testListenTwice() throws Exception {
        server.requestHandler(noOpHandler());
        server.listen();
        assertIllegalStateException(() -> server.listen());
    }
}
