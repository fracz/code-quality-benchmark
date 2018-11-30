// original filename: 00006589.txt
// after
public class Class00000440Better {
    // private static final String GEN_CLASS_PACKAGE = "dummy";
// private static final String GEN_CLASS_FULL_NAME = GEN_CLASS_PACKAGE + '.' + GEN_CLASS_NAME;
// private static final String GEN_METHOD_NAME = "invoke";
    protected String getGenClassQName() {
        return ApplicationManager.getApplication().runReadAction((Computable<String>) () -> JVMNameUtil.getNonAnonymousClassName(myData.getGeneratedInnerClass()));
    }
}
