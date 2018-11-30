// original filename: 00055019.txt
// before
public class Class00000591Better {
    public String assignVar(InsnNode insn) throws CodegenException {
        RegisterArg arg = insn.getResult();
        if (insn.getAttributes().contains(AttributeFlag.DECLARE_VAR)) {
            return declareVar(arg);
        } else {
            return arg(arg).toString();
        }
    }
}
