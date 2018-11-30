// original filename: 00003572.txt
// after
public class Class00000333Better {
    public DialogWrapper createConfigurationDialog(Breakpoint initialBreakpoint, String selectComponent) {
        if (myBreakpointsConfigurable == null) {
            myBreakpointsConfigurable = new BreakpointsConfigurationDialogFactory(myProject);
        }
        return myBreakpointsConfigurable.createDialog(initialBreakpoint, selectComponent);
    }
}
