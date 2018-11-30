// original filename: 00055650.txt
// before
public class Class00000422Worse {
    @Test
    public void testFactoryReferenceWithDoublePrefix() {
        XmlBeanFactory xbf = new XmlBeanFactory(new ClassPathResource("factoryCircle.xml", getClass()));
        assertThat(xbf.getBean("&&singletonFactory"), instanceOf(DummyFactory.class));
    }
}
