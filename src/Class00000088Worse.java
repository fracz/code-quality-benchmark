// original filename: 00055665.txt
// before
public class Class00000088Worse {
    @Test
    public void testNoSuchFactoryBeanMethod() {
        try {
            XmlBeanFactory xbf = new XmlBeanFactory(new ClassPathResource("no-such-factory-method.xml", getClass()));
            assertNotNull(xbf.getBean("defaultTestBean"));
            fail("Should not get invalid bean");
        } catch (BeanCreationException ex) {
            // Ok
        }
    }
}
