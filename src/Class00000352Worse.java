// original filename: 00055056.txt
// before
public class Class00000352Worse {
    public String getNameWithoutPackage() {
        return (parentClass != null ? parentClass.getNameWithoutPackage() + "." : "") + name;
    }
}
