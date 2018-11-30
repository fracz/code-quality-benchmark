// original filename: 00011834.txt
// after
public class Class00000558Worse {
    @Deprecated
    public /**
     * Deprecated. Current implementation blindly calls plain refresh against the file passed
     */
    void forceRefreshFile(final boolean asynchronous, @NotNull VirtualFile file) {
        file.refresh(asynchronous, false);
    }
}
