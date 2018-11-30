// original filename: 00037003.txt
// before
public class Class00000171Worse {
    private static void updateExecuteQueryMethod(ClassPool classPool, CtClass cc) throws Exception {
        CtMethod serviceMethod = cc.getDeclaredMethod("executeQuery", null);
        log("*** Changing executeQuery method ");
        // serviceMethod.insertBefore(getExecuteQueryMethodBeforeInsertCode());
        serviceMethod.insertAfter(getExecuteQueryMethodAfterInsertCode());
    }
}
