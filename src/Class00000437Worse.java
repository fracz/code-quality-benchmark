// original filename: 00011307.txt
// before
public class Class00000437Worse {
    @Override
    public void contentsChanged(@NotNull final VirtualFileEvent event) {
        processEventFile("contentsChanged", event.getFile(), (eventFile) -> collectPathsAndNotify(eventFile, NOTIFY_CHANGED));
    }
}
