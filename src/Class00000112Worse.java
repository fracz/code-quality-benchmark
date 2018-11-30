// original filename: 00035857.txt
// before
public class Class00000112Worse {
    @Test
    public void shouldNotAllowExtraInterfaceThatIsTheSameAsTheMockedType() throws Exception {
        try {
            // when
            validator.validateExtraInterfaces(IMethods.class, new Class<?>[]{IMethods.class});
            fail();
        } catch (MockitoException e) {
            // then
            assertContains("You mocked following type: IMethods", e.getMessage());
        }
    }
}
