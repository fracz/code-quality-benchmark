// original filename: 00036188.txt
// before
public class Class00000121Worse {
    public void wantedButNotInvokedInOrder(PrintableInvocation wanted, PrintableInvocation previous, HasStackTrace previousStackTrace) {
        throw new VerificationInOrderFailure(join("Verification in order failure", "Wanted but not invoked:", wanted.toString(), "-> at " + new Location(), "Wanted anywhere AFTER following interaction:", previous.toString(), "-> at " + previousStackTrace.getStackTrace()[0], ""));
    }
}
