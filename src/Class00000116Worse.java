// original filename: 00001885.txt
// before
public class Class00000116Worse {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isVersionedDirectory(VirtualFile dir) {
        final VirtualFile versionFile = dir.findChild(".git");
        return versionFile != null && versionFile.isDirectory();
    }
}
