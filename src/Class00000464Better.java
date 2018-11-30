// original filename: 00011304.txt
// after
public class Class00000464Better {
    @Override
    public void beforeFileDeletion(@NotNull final VirtualFileEvent event) {
        collectPathsAndNotify(event.getFile(), TranslatingCompilerFilesMonitor::notifyFilesDeleted);
    }
}
