// original filename: 00002901.txt
// before
public class Class00000229Worse {
    protected DomModelTreeView getTreeView(AnActionEvent e) {
        if (myTreeView != null)
            return myTreeView;
        return (DomModelTreeView) e.getDataContext().getData(DomModelTreeView.DOM_MODEL_TREE_VIEW_KEY);
    }
}
