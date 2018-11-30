// original filename: 00033216.txt
// before
public class Class00000051Worse {
    private boolean isChanging(ResolvedModuleRevision resolvedModuleRevision) {
        if (resolver instanceof IvyDependencyResolver) {
            return ((IvyDependencyResolver) resolver).isChangingModule(resolvedModuleRevision.getDescriptor());
        }
        return false;
    }
}
