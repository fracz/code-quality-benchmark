// original filename: 00008432.txt
// before
public class Class00000169Worse {
    public void testEmptyVsMap() throws Exception {
        PsiReference ref = configureByFile("emptyVsMap/A.groovy");
        PsiElement resolved = ref.resolve();
        assertTrue(resolved instanceof PsiMethod);
        assertEquals(0, ((PsiMethod) resolved).getParameterList().getParametersCount());
    }
}
