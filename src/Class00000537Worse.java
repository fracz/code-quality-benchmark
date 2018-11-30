// original filename: 00027844.txt
// after
public class Class00000537Worse {
    /**
     * Returns true if workspace was started and its status is
     * {@link WorkspaceStatus#RUNNING running}, {@link WorkspaceStatus#STARTING starting}
     * or {@link WorkspaceStatus#STOPPING stopping} - otherwise returns false.
     * <p>
     * <p> This method is less expensive alternative to {@link #get(String)} + {@code try catch}, see example:
     * <pre>{@code
     *
     * if (!runtimes.hasRuntime("workspace123")) {
     * doStuff("workspace123");
     * }
     *
     * //vs
     *
     * try {
     * runtimes.get("workspace123");
     * } catch (NotFoundException ex) {
     * doStuff("workspace123");
     * }
     *
     * }</pre>
     *
     * @param workspaceId workspace identifier to perform check
     * @return true if workspace is running, otherwise false
     */
    public boolean hasRuntime(String workspaceId) {
        try (StripedLocks.ReadLock lock = stripedLocks.acquireReadLock(workspaceId)) {
            return workspaces.containsKey(workspaceId);
        }
    }
}
