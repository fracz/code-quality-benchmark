// original filename: 00010601.txt
// before
public class Class00000407Worse {
    private boolean containsDescriptionDir(VirtualFile root) {
        if (!root.isDirectory())
            return false;
        for (VirtualFile file : root.getChildren()) {
            if (file.isDirectory() && getDescriptionFolderName().equals(file.getName())) {
                return true;
            }
        }
        return false;
    }
}
