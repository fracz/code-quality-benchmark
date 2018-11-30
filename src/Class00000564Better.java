// original filename: 00004773.txt
// before
public class Class00000564Better {
    protected void dispose() {
        PsiManager.getInstance(myProject).removePsiTreeChangeListener(myPsiListener);
        DebuggerManagerEx.getInstanceEx(myProject).getContextManager().removeListener(myContextListener);
        myEvaluationPanel.dispose();
        super.dispose();
    }
}
