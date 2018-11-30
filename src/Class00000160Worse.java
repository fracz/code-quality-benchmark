// original filename: 00055679.txt
// before
public class Class00000160Worse {
    @Test
    public void testSatisfiedSimpleDependencyCheck() throws Exception {
        XmlBeanFactory xbf = new XmlBeanFactory(new ClassPathResource("satisfiedSimpleDependencyCheck.xml", getClass()));
        DependenciesBean a = (DependenciesBean) xbf.getBean("a");
        assertEquals(a.getAge(), 33);
    }
}
