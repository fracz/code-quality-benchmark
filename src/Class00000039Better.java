// original filename: 00028232.txt
// after
public class Class00000039Better {
    @Test
    public void testListenNoHandlers() throws Exception {
        assertIllegalStateException(() -> server.listen(ar -> {
        }));
    }
}
