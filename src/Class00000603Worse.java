// original filename: 00004583.txt
// after
public class Class00000603Worse {
    protected final PsiElement getSelectedElement() {
        final DefaultMutableTreeNode node = getSelectedNode();
        HierarchyNodeDescriptor descriptor = getDescriptor(node);
        return descriptor != null ? getElementFromDescriptor(descriptor) : null;
    }
}
