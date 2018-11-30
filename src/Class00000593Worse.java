// original filename: 00000376.txt
// after
public class Class00000593Worse {
    @Test
    public void mkdirInvalidPathTest() throws IOException {
        Assert.assertEquals(-1, mFsShell.run(new String[]{"mkdir", "/test File Invalid Path"}));
    }
}
