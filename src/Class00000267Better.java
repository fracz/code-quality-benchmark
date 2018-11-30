// original filename: 00039562.txt
// after
public class Class00000267Better {
    public boolean deleteLogicalLog(long version) {
        File file = new File(getFileName(version));
        return file.exists() ? FileUtils.deleteFile(file) : false;
    }
}
