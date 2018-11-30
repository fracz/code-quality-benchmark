// original filename: 00036971.txt
// before
public class Class00000398Worse {
    private static void updateExecuteQueryMethod(ClassPool classPool, CtClass cc) throws Exception {
        CtMethod serviceMethod = cc.getDeclaredMethod("execute", null);
        log("*** Changing executeQuery() method ");
        // serviceMethod.insertBefore(getExecuteQueryMethodBeforeInsertCode());
        serviceMethod.insertAfter(getExecuteQueryMethodAfterInsertCode());
    }
}
