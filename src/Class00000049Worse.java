// original filename: 00012433.txt
// before
public class Class00000049Worse {
    protected boolean thereAreUnversionedFiles(final AnActionEvent e) {
        final List<VirtualFile> unversionedFiles = getUnversionedFiles(e);
        return unversionedFiles != null && !(unversionedFiles.isEmpty());
    }
}
