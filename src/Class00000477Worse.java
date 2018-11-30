// original filename: 00056085.txt
// after
public class Class00000477Worse {
    @Test
    public void testGetObjectType() {
        replay(beanFactory);
        assertEquals(Method.class, factory.getObjectType());
    }
}
