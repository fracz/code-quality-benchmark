// original filename: 00037036.txt
// after
public class Class00000099Better {
    public static byte[] modify(ClassPool classPool, ClassLoader classLoader, String javassistClassName, byte[] classFileBuffer) {
        if (logger.isDebugEnabled()) {
            printClassInfo(javassistClassName);
        }
        return changeMethod(classPool, classLoader, javassistClassName, classFileBuffer);
    }
}
