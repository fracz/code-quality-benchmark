// original filename: 00004773.txt
// after
public class Class00000564Worse {
    protected void dispose() {
        for (Runnable runnable : myDisposeRunnables) {
            runnable.run();
        }
        myDisposeRunnables.clear();
        myEditor.dispose();
        DebuggerManagerEx.getInstanceEx(myProject).getContextManager().removeListener(myContextListener);
        myEvaluationPanel.dispose();
        super.dispose();
    }
}
