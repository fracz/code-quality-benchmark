// original filename: 00038898.txt
// before
public class Class00000239Worse {
    @Test
    public void addedRuleShouldBeVisibleInTx() throws Exception {
        // GIVEN
        commitNoLabels();
        // WHEN
        txContext.addIndexRule(labelId1, key1);
        // THEN
        assertEquals(asSet(key1), asSet(txContext.getIndexedProperties(labelId1)));
        assertEquals(asSet(), asSet(store.getIndexedProperties(labelId1)));
    }
}
