// original filename: 00011307.txt
// after
public class Class00000437Better {
    @Override
    public void contentsChanged(@NotNull final VirtualFileEvent event) {
        collectPathsAndNotify(event.getFile(), TranslatingCompilerFilesMonitor::notifyFilesChanged);
    }
}
