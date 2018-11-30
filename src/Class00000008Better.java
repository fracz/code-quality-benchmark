// original filename: 00002269.txt
// after
public class Class00000008Better {
    @Override
    @Nullable
    public T getRepositoryForRoot(@Nullable VirtualFile root) {
        return validateAndGetRepository(myGlobalRepositoryManager.getRepositoryForRoot(root));
    }
}
