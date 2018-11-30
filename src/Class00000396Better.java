// original filename: 00035818.txt
// after
public class Class00000396Better {
    public void tooLittleActualInvocationsInOrder(Discrepancy discrepancy, PrintableInvocation wanted, HasStackTrace lastActualStackTrace) {
        String message = createTooLittleInvocationsMessage(discrepancy, wanted, lastActualStackTrace);
        throw new VerifcationInOrderFailure(join("Verification in order failure:" + message));
    }
}
