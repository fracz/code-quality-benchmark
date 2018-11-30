// original filename: 00010283.txt
// before
public class Class00000519Better {
    @Override
    public void visitParameter(String name, int access) {
        parameterNames.add(name);
        super.visitParameter(name, access);
    }
}
