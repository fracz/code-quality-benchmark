// original filename: 00036262.txt
// before
public class Class00000554Better {
    @Test(expected = VerifcationInOrderFailed.class)
    public void shouldFailWhenMiddleMethodVerifiedFirstInAtLeastOnceMode() {
        inOrder.verify(mockTwo, atLeastOnce()).simpleMethod(2);
    }
}
