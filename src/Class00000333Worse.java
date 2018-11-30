// original filename: 00003572.txt
// before
public class Class00000333Worse {
    public DialogWrapper createConfigurationDialog(Breakpoint initialBreakpoint, String selectComponent) {
        if (myBreakpointsConfigurable == null) {
            myBreakpointsConfigurable = new BreakpointsConfigurationDialogFactory(myProject);
        }
        DialogWrapper dialog = myBreakpointsConfigurable.createDialog(initialBreakpoint, selectComponent);
        return dialog;
    }
}
