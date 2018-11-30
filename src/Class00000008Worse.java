// original filename: 00002269.txt
// before
public class Class00000008Worse {
    @Override
    @Nullable
    public T getRepositoryForRoot(@Nullable VirtualFile root) {
        Repository repository = myGlobalRepositoryManager.getRepositoryForRoot(root, true);
        // noinspection unchecked
        return isRootValid(repository) ? (T) repository : null;
    }
}
