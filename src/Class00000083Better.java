// original filename: 00040539.txt
// after
public class Class00000083Better {
    public void deactivate() {
        // execute all scripts that were registered for system shutdown
        executeScripts(triggerManager.getRules(SHUTDOWN));
        triggerManager.clearAll();
        triggerManager = null;
    }
}
