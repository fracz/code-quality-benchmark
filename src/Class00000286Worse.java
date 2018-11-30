// original filename: 00001761.txt
// before
public class Class00000286Worse {
    public void testNoParams() throws Exception {
        doTest(new GenParams() {

            @Override
            public TypeParameterInfo[] gen(PsiClass aClass) throws IncorrectOperationException {
                return new TypeParameterInfo[]{new TypeParameterInfo(aClass, "T", "java.lang.String")};
            }
        });
    }
}
