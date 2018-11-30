// original filename: 00036260.txt
// before
public class Class00000606Better {
    /* -------------- */
    @Test(expected = VerifcationInOrderFailed.class)
    public void shouldFailWhenLastMethodVerifiedFirst() {
        inOrder.verify(mockOne).simpleMethod(4);
    }
}
