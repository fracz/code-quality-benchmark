// original filename: 00035857.txt
// after
public class Class00000112Better {
    @Test
    public void shouldNotAllowExtraInterfaceThatIsTheSameAsTheMockedType() throws Exception {
        try {
            // when
            validator.validateExtraInterfaces(IMethods.class, (Collection) asList(IMethods.class));
            fail();
        } catch (MockitoException e) {
            // then
            assertContains("You mocked following type: IMethods", e.getMessage());
        }
    }
}
