// original filename: 00035795.txt
// after
public class Class00000105Better {
    @Test
    public void shouldNotCheckForWrongNumberOfModificationsWhenVerifyingInOrder() throws Exception {
        VerifyingMode inOrder = VerifyingMode.inOrder(1, Arrays.asList(new Object()));
        assertTrue(inOrder.orderOfInvocationsMatters());
        behavior.checkForWrongNumberOfInvocations(toLowerCaseInvocation, inOrder);
    }
}
