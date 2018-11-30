// original filename: 00012797.txt
// after
public class Class00000273Better {
    public void add(String... filenames) throws IOException {
        if (filenames.length == 0) {
            myRunEnv.run("add", ".");
        } else {
            myRunEnv.run("add", filenames);
        }
    }
}
