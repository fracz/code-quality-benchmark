// original filename: 00036971.txt
// after
public class Class00000398Better {
    private static void updateExecuteQueryMethod(ClassPool classPool, CtClass cc) throws Exception {
        CtMethod serviceMethod = cc.getDeclaredMethod("execute", null);
        logger.info("Changing executeQuery() method.");
        serviceMethod.insertBefore(getExecuteQueryMethodBeforeInsertCode());
        serviceMethod.insertAfter(getExecuteQueryMethodAfterInsertCode());
    }
}
