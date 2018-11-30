// original filename: 00037169.txt
// before
public class Class00000611Better {
    private static void updateCloseMethod(ClassPool classPool, CtClass cc) throws Exception {
        CtMethod serviceMethod1 = cc.getDeclaredMethod("close", null);
        logger.info("Changing close() method ");
        serviceMethod1.insertBefore(getCloseMethodBeforeInsertCode());
    }
}
