// original filename: 00003815.txt
// before
public class Class00000156Worse {
    @Test
    public void testDeletionWithoutParent() {
        vcs.createFile("file", null, -1);
        VirtualFile f = new TestVirtualFile("file", null, -1);
        fireDeleted(f, null);
        assertFalse(vcs.hasEntry("file"));
    }
}
