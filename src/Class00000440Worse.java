// original filename: 00006589.txt
// before
public class Class00000440Worse {
    // private static final String GEN_CLASS_PACKAGE = "dummy";
// private static final String GEN_CLASS_FULL_NAME = GEN_CLASS_PACKAGE + '.' + GEN_CLASS_NAME;
// private static final String GEN_METHOD_NAME = "invoke";
    protected String getGenClassQName() {
        return ApplicationManager.getApplication().runReadAction(new Computable<String>() {

            @Override
            public String compute() {
                return JVMNameUtil.getNonAnonymousClassName(myData.getGeneratedInnerClass());
            }
        });
    }
}
