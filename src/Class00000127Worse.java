// original filename: 00011876.txt
// before
public class Class00000127Worse {
    @Nullable
    public String quickCheckHaveStuff() {
        if (mySteps.isEmpty())
            return "Nothing selected to show diff";
        if (mySteps.size() == 1) {
            return mySteps.get(0).haveStuff();
        }
        return null;
    }
}
