// original filename: 00038936.txt
// before
public class Class00000038Worse {
    public boolean hasLogicalLog(long version) {
        String name = fileName + ".v" + version;
        return new File(name).exists();
    }
}
