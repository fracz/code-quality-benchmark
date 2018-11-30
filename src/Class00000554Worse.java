// original filename: 00036262.txt
// after
public class Class00000554Worse {
    @Test
    public void shouldFailWhenMiddleMethodVerifiedFirstInAtLeastOnceMode() {
        inOrder.verify(mockTwo, atLeastOnce()).simpleMethod(2);
        try {
            inOrder.verify(mockOne).simpleMethod(1);
            fail();
        } catch (VerifcationInOrderFailed e) {
        }
    }
}
