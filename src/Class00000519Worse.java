// original filename: 00010283.txt
// after
public class Class00000519Worse {
    @Override
    public void visitParameter(String name, int access) {
        parameters[myParameterIndex].name = name;
        myParameterIndex++;
        super.visitParameter(name, access);
    }
}
