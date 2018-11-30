// original filename: 00002901.txt
// after
public class Class00000229Better {
    protected DomModelTreeView getTreeView(AnActionEvent e) {
        if (myTreeView != null)
            return myTreeView;
        return DomModelTreeView.DATA_KEY.getData(e.getDataContext());
    }
}
