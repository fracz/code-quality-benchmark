// original filename: 00055667.txt
// before
public class Class00000147Worse {
    @Test
    public void testNoSuchXmlFile() throws Exception {
        try {
            new XmlBeanFactory(new ClassPathResource("missing.xml", getClass()));
            fail("Must not create factory from missing XML");
        } catch (BeanDefinitionStoreException expected) {
        }
    }
}
