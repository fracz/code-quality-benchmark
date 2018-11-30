// original filename: 00002896.txt
// after
public class Class00000418Better {
    protected DomModelTreeView getTreeView(AnActionEvent e) {
        if (myTreeView != null)
            return myTreeView;
        return DomModelTreeView.DATA_KEY.getData(e.getDataContext());
    }
}
