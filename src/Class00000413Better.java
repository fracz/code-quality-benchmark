// original filename: 00036992.txt
// after
public class Class00000413Better {
    private static void updateCloseMethod(ClassPool classPool, CtClass cc) throws Exception {
        CtMethod serviceMethod = cc.getDeclaredMethod("close", null);
        logger.info("Changing close method ");
        serviceMethod.insertBefore(getCloseMethodBeforeInsertCode());
        serviceMethod.insertAfter(getCloseMethodAfterInsertCode());
    }
}
