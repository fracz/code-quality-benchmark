// original filename: 00039568.txt
// after
public class Class00000000Better {
    public long getLogicalLogLength(long version) {
        File file = new File(getFileName(version));
        return file.exists() ? file.length() : -1;
    }
}
