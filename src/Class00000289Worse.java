// original filename: 00005703.txt
// before
public class Class00000289Worse {
    @Contract("_, _ -> !null")
    static TerminalBlock from(PsiVariable variable, PsiStatement statement) {
        return new TerminalBlock(variable, new PsiStatement[]{statement});
    }
}
