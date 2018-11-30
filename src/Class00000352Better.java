// original filename: 00055056.txt
// after
public class Class00000352Better {
    public String getNameWithoutPackage() {
        if (parentClass == null) {
            return name;
        }
        return parentClass.getNameWithoutPackage() + "." + name;
    }
}
