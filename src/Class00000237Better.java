// original filename: 00002995.txt
// after
public class Class00000237Better {
    public String expand(DataContext dataContext) {
        VirtualFile file = PlatformDataKeys.VIRTUAL_FILE.getData(dataContext);
        if (file == null) {
            return null;
        }
        return file.getExtension();
    }
}
