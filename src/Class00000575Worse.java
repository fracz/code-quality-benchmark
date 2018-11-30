// original filename: 00013058.txt
// after
public class Class00000575Worse {
    private void storeRefreshStatusToFiles() {
        if (FileWatcher.getInstance().isOperational()) {
            // TODO: different ways to marky dirty for all these cases
            markPathsDirty(FileWatcher.getInstance().getDirtyPaths());
            markFlatDirsDirty(FileWatcher.getInstance().getDirtyDirs());
            markRecursiveDirsDirty(FileWatcher.getInstance().getDirtyRecursivePaths());
        }
    }
}
