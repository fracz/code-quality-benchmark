// original filename: 00040539.txt
// before
public class Class00000083Worse {
    public void deactivate() {
        // execute all scripts that were registered for system shutdown
        executeScripts(systemShutdownTriggeredRules);
        updateEventTriggeredRules.clear();
        commandEventTriggeredRules.clear();
        systemShutdownTriggeredRules.clear();
        systemStartupTriggeredRules.clear();
    }
}
