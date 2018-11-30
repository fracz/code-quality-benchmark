// original filename: 00037169.txt
// after
public class Class00000611Worse {
    private static void updateCloseMethod(ClassPool classPool, CtClass cc) throws Exception {
        CtMethod method = cc.getDeclaredMethod("close", null);
        method.insertBefore("{" + TomcatProfilerConstant.CLASS_NAME_REQUEST_DATA_TRACER + ".addResultSetData(); } ");
    }
}
