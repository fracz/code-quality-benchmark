// original filename: 00001762.txt
// before
public class Class00000122Worse {
    public void testRemoveAllParams() throws Exception {
        doTest(new GenParams() {

            @Override
            public TypeParameterInfo[] gen(PsiClass aClass) {
                return new TypeParameterInfo[0];
            }
        });
    }
}
