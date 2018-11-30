// original filename: 00036331.txt
// before
public class Class00000435Worse {
    public void verify(List<Invocation> invocations, InvocationMatcher wanted) {
        Invocation unverified = new InvocationsFinder().findFirstUnverified(invocations);
        if (unverified != null) {
            new Reporter().noMoreInteractionsWanted(unverified, unverified.getStackTrace());
        }
    }
}
