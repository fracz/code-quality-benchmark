// original filename: 00027826.txt
// before
public class Class00000573Better {
    /**
     * Gets list of workspaces which user can read
     * <p>
     * <p>Returned workspaces have either {@link WorkspaceStatus#STOPPED} status
     * or status defined by their runtime instances(if those exist).
     *
     * @param user the id of the user
     * @return the list of workspaces or empty list if user can't read any workspace
     * @throws NullPointerException when {@code user} is null
     * @throws ServerException      when any server error occurs while getting workspaces with {@link WorkspaceDao#getWorkspaces(String)}
     */
    public List<WorkspaceImpl> getWorkspaces(String user) throws ServerException {
        requireNonNull(user, "Required non-null user id");
        final List<WorkspaceImpl> workspaces = workspaceDao.getWorkspaces(user);
        workspaces.forEach(this::normalizeState);
        return workspaces;
    }
}
