// original filename: 00035818.txt
// before
public class Class00000396Worse {
    public void tooLittleActualInvocationsInOrder(int wantedCount, int actualCount, PrintableInvocation wanted, HasStackTrace lastActualStackTrace) {
        String message = createTooLittleInvocationsMessage(wantedCount, actualCount, wanted, lastActualStackTrace);
        throw new VerifcationInOrderFailure(join("Verification in order failure:" + message));
    }
}
