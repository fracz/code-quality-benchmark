// original filename: 00002896.txt
// before
public class Class00000418Worse {
    protected DomModelTreeView getTreeView(AnActionEvent e) {
        if (myTreeView != null)
            return myTreeView;
        return (DomModelTreeView) e.getDataContext().getData(DomModelTreeView.DOM_MODEL_TREE_VIEW_KEY);
    }
}
