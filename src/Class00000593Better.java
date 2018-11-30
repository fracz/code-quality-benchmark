// original filename: 00000376.txt
// before
public class Class00000593Better {
    @Test(expected = IOException.class)
    public void mkdirInvalidPathTest() throws IOException {
        mFsShell.mkdir(new String[]{"mkdir", "/test File Invalid Path"});
    }
}
