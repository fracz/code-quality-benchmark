// original filename: 00055650.txt
// after
public class Class00000422Better {
    @Test
    public void testFactoryReferenceWithDoublePrefix() {
        XmlBeanFactory xbf = new XmlBeanFactory(FACTORY_CIRCLE_CONTEXT);
        assertThat(xbf.getBean("&&singletonFactory"), instanceOf(DummyFactory.class));
    }
}
