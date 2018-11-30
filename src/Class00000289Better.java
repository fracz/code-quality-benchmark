// original filename: 00005703.txt
// after
public class Class00000289Better {
    @NotNull
    public static TerminalBlock from(PsiVariable variable, PsiStatement statement) {
        return new TerminalBlock(null, variable, statement).extractOperations();
    }
}
