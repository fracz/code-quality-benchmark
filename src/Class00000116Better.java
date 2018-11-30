// original filename: 00001885.txt
// after
public class Class00000116Better {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isVersionedDirectory(VirtualFile dir) {
        return dir.isDirectory() && GitUtil.gitRootOrNull(dir) != null;
    }
}
