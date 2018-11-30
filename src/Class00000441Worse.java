// original filename: 00039570.txt
// before
public class Class00000441Worse {
    public boolean hasLogicalLog(long version) {
        String name = fileName + ".v" + version;
        return new File(name).exists();
    }
}
