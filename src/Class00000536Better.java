// original filename: 00005680.txt
// before
public class Class00000536Better {
    @Test
    public void testAffectedEntryForRenameChange() {
        root.createFile(42, "name", null, -1);
        StructuralChange c = new RenameChange("name", "new name");
        c.applyTo(root);
        assertEquals(list(idp(42)), c.getAffectedIdPaths());
    }
}
