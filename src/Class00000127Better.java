// original filename: 00011876.txt
// after
public class Class00000127Better {
    @Nullable
    public void quickCheckHaveStuff() throws VcsException {
        if (mySteps.isEmpty()) {
            throw new VcsException("Nothing selected to show diff");
        }
        if (mySteps.size() == 1) {
            mySteps.get(0).haveStuff();
        }
    }
}
