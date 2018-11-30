// original filename: 00005680.txt
// after
public class Class00000536Worse {
    @Test
    public void testAffectedEntryForRenameChange() {
        createFile(root, 42, "name", null, -1);
        StructuralChange c = new RenameChange("name", "new name");
        c.applyTo(root);
        assertEquals(list(idp(-1, 42)), c.getAffectedIdPaths());
    }
}
