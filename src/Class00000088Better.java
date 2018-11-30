// original filename: 00055665.txt
// after
public class Class00000088Better {
    @Test
    public void testNoSuchFactoryBeanMethod() {
        try {
            XmlBeanFactory xbf = new XmlBeanFactory(NO_SUCH_FACTORY_METHOD_CONTEXT);
            assertNotNull(xbf.getBean("defaultTestBean"));
            fail("Should not get invalid bean");
        } catch (BeanCreationException ex) {
            // Ok
        }
    }
}
