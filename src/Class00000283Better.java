// original filename: 00028060.txt
// after
public class Class00000283Better {
    @Override
    public void onCommandRemoved(CommandRemovedEvent event) {
        if (event.getCommand().getName().equals(editedCommand.getName())) {
            editorAgent.closeEditor(this);
            commandRemovedHandlerRegistration.removeHandler();
        }
    }
}
