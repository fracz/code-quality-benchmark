// original filename: 00003815.txt
// after
public class Class00000156Better {
    @Test
    public void testDeletionWithoutParent() {
        vcs.createFile("file", null, -1);
        fireDeletion(new TestVirtualFile("file", null, -1));
        assertFalse(vcs.hasEntry("file"));
    }
}
