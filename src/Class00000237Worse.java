// original filename: 00002995.txt
// before
public class Class00000237Worse {
    public String expand(DataContext dataContext) {
        VirtualFile file = (VirtualFile) dataContext.getData(DataConstants.VIRTUAL_FILE);
        if (file == null)
            return null;
        return file.getExtension();
    }
}
