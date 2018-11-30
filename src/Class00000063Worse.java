// original filename: 00001766.txt
// before
public class Class00000063Worse {
    public void testSubstituteParamInsideClass() throws Exception {
        doTest(new GenParams() {

            @Override
            public TypeParameterInfo[] gen(PsiClass aClass) throws IncorrectOperationException {
                return new TypeParameterInfo[0];
            }
        });
    }
}
