// original filename: 00036331.txt
// after
public class Class00000435Better {
    public void verify(VerificationData data) {
        Invocation unverified = new InvocationsFinder().findFirstUnverified(data.getAllInvocations());
        if (unverified != null) {
            new Reporter().noMoreInteractionsWanted(unverified, unverified.getStackTrace());
        }
    }
}
