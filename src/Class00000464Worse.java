// original filename: 00011304.txt
// before
public class Class00000464Worse {
    @Override
    public void beforeFileDeletion(@NotNull final VirtualFileEvent event) {
        processEventFile("beforeFileDeletion", event.getFile(), (eventFile) -> collectPathsAndNotify(eventFile, NOTIFY_DELETED));
    }
}
