// original filename: 00011310.txt
// before
public class Class00000233Worse {
    @Override
    public void fileMoved(@NotNull VirtualFileMoveEvent event) {
        processEventFile("fileMoved", event.getFile(), (eventFile) -> collectPathsAndNotify(eventFile, NOTIFY_CHANGED));
    }
}
