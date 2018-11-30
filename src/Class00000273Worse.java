// original filename: 00012797.txt
// before
public class Class00000273Worse {
    public void add(String... filenames) throws IOException {
        if (filenames.length == 0) {
            execute(true, "add", ".");
        } else {
            execute(true, join("add", filenames));
        }
    }
}
