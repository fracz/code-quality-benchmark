// original filename: 00039568.txt
// before
public class Class00000000Worse {
    public long getLogicalLogLength(long version) {
        String name = fileName + ".v" + version;
        File file = new File(name);
        if (!file.exists()) {
            return -1;
        }
        return file.length();
    }
}
