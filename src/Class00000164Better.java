// original filename: 00038928.txt
// after
public class Class00000164Better {
    public boolean deleteLogicalLog(long version) {
        File file = new File(getFileName(version));
        return file.exists() ? FileUtils.deleteFile(file) : false;
    }
}
