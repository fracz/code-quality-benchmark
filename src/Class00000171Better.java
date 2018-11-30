// original filename: 00037003.txt
// after
public class Class00000171Better {
    private static void updateExecuteQueryMethod(ClassPool classPool, CtClass cc) throws Exception {
        CtMethod serviceMethod = cc.getDeclaredMethod("executeQuery", null);
        logger.info("*** Changing executeQuery method ");
        serviceMethod.insertBefore(getExecuteQueryMethodBeforeInsertCode());
        serviceMethod.insertAfter(getExecuteQueryMethodAfterInsertCode());
    }
}
