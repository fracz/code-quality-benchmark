// original filename: 00035795.txt
// before
public class Class00000105Worse {
    @Test
    public void shouldNotCheckForWrongNumberOfModificationsWhenVerifyingInOrder() throws Exception {
        behavior.checkForWrongNumberOfInvocations(toLowerCaseInvocation, VerifyingMode.inOrder(1, Arrays.asList(new Object())));
    }
}
