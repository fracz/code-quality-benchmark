// original filename: 00036962.txt
// before
public class Class00000302Worse {
    private static void updateCloseMethod(ClassPool classPool, CtClass cc) throws Exception {
        CtMethod serviceMethod = cc.getDeclaredMethod("close", null);
        log("*** Changing close method ");
        // serviceMethod.insertBefore(getCloseMethodBeforeInsertCode());
        serviceMethod.insertAfter(getCloseMethodAfterInsertCode());
    }
}
