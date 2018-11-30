// original filename: 00010601.txt
// after
public class Class00000407Better {
    private boolean containsDescriptionDir(VirtualFile root) {
        if (!root.isDirectory())
            return false;
        return Arrays.stream(root.getChildren()).anyMatch(file -> file.isDirectory() && getDescriptionFolderName().equals(file.getName()));
    }
}
