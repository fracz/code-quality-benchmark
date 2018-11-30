// original filename: 00038898.txt
// after
public class Class00000239Better {
    @Test
    public void addedRuleShouldBeVisibleInTx() throws Exception {
        // GIVEN
        commitNoLabels();
        // WHEN
        IndexRule rule = txContext.addIndexRule(labelId1, key1);
        // THEN
        assertEquals(asSet(rule), asSet(txContext.getIndexRules(labelId1)));
        verify(store).addIndexRule(labelId1, key1);
    }
}
