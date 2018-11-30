// original filename: 00036260.txt
// after
public class Class00000606Worse {
    /* -------------- */
    @Test
    public void shouldFailWhenLastMethodVerifiedFirst() {
        inOrder.verify(mockOne).simpleMethod(4);
        try {
            inOrder.verify(mockOne).simpleMethod(1);
            fail();
        } catch (VerifcationInOrderFailed e) {
        }
    }
}
