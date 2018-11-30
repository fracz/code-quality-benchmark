// original filename: 00036188.txt
// after
public class Class00000121Better {
    // TODO merge location into PrintableInvocation?
    public void wantedButNotInvokedInOrder(PrintableInvocation wanted, PrintableInvocation previous, Location previousLocation) {
        throw new VerificationInOrderFailure(join("Verification in order failure", "Wanted but not invoked:", wanted.toString(), "-> at " + new Location(), "Wanted anywhere AFTER following interaction:", previous.toString(), "-> at " + previousLocation, ""));
    }
}
