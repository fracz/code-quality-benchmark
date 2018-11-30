// original filename: 00055679.txt
// after
public class Class00000160Better {
    @Test
    public void testSatisfiedSimpleDependencyCheck() throws Exception {
        XmlBeanFactory xbf = new XmlBeanFactory(SATISFIED_SIMPLE_DEP_CONTEXT);
        DependenciesBean a = (DependenciesBean) xbf.getBean("a");
        assertEquals(a.getAge(), 33);
    }
}
