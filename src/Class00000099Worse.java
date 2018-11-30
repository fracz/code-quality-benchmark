// original filename: 00037036.txt
// before
public class Class00000099Worse {
    public static byte[] modify(ClassPool classPool, ClassLoader classLoader, String javassistClassName, byte[] classFileBuffer) {
        // printClassInfo(javassistClassName);
        return changeMethod(classPool, classLoader, javassistClassName, classFileBuffer);
    }
}
