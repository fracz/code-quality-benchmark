// original filename: 00028060.txt
// before
public class Class00000283Worse {
    @Override
    public void onCommandRemoved(CommandImpl command) {
        if (command.getName().equals(editedCommand.getName())) {
            editorAgent.closeEditor(this);
            Scheduler.get().scheduleDeferred(() -> commandManager.removeCommandChangedListener(this));
        }
    }
}
