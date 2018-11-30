// original filename: 00055667.txt
// after
public class Class00000147Better {
    @Test
    public void testNoSuchXmlFile() throws Exception {
        try {
            new XmlBeanFactory(MISSING_CONTEXT);
            fail("Must not create factory from missing XML");
        } catch (BeanDefinitionStoreException expected) {
        }
    }
}
