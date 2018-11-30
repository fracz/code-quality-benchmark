// original filename: 00008049.txt
// before
public class Class00000291Worse {
    public static PyClassType fromClassName(String typeName, Project project) {
        PyClass clazz = PyClassNameIndex.findClass(typeName, project);
        return new PyClassType(clazz, true);
    }
}
