// original filename: 00008432.txt
// after
public class Class00000169Better {
    public void testEmptyVsMap() throws Exception {
        PsiReference ref = configureByFile("emptyVsMap/A.groovy");
        PsiMethod resolved = ((GrNewExpression) ref.getElement().getParent()).resolveConstructor();
        assertNotNull(resolved);
        assertEquals(0, resolved.getParameterList().getParametersCount());
    }
}
