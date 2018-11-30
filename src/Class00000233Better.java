// original filename: 00011310.txt
// after
public class Class00000233Better {
    @Override
    public void fileMoved(@NotNull VirtualFileMoveEvent event) {
        collectPathsAndNotify(event.getFile(), TranslatingCompilerFilesMonitor::notifyFilesChanged);
    }
}
