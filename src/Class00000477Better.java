// original filename: 00056085.txt
// before
public class Class00000477Better {
    @Test
    public void testGetObjectType() throws Exception {
        MethodLocatingFactoryBean factory = new MethodLocatingFactoryBean();
        assertEquals(Method.class, factory.getObjectType());
    }
}
