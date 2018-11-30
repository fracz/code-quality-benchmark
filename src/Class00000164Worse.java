// original filename: 00038928.txt
// before
public class Class00000164Worse {
    public boolean deleteLogicalLog(long version) {
        String name = fileName + ".v" + version;
        File file = new File(name);
        if (file.exists()) {
            return FileUtils.deleteFile(file);
        }
        return false;
    }
}
