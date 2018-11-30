// original filename: 00028232.txt
// before
public class Class00000039Worse {
    @Test
    public void testListenNoHandlers() throws Exception {
        try {
            server.listen(ar -> {
            });
            fail("Should throw exception");
        } catch (IllegalStateException e) {
            // Ok
        }
    }
}
