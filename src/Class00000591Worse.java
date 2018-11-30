// original filename: 00055019.txt
// after
public class Class00000591Worse {
    public void assignVar(CodeWriter code, InsnNode insn) throws CodegenException {
        RegisterArg arg = insn.getResult();
        if (insn.getAttributes().contains(AttributeFlag.DECLARE_VAR)) {
            declareVar(code, arg);
        } else {
            addArg(code, arg, false);
        }
    }
}
