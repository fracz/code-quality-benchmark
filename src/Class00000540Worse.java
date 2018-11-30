// original filename: 00056645.txt
// after
public class Class00000540Worse {
    @Override
    void resetChildIter() {
        decommitVariableGroups();
        removeNamedNodes();
        treeNodeMatchCandidateIterator = myNode.rel.searchNodeIterator(tree, this);
        finished = false;
        nextTreeNodeMatchCandidate = null;
        if (childMatcher != null) {
            // need to tell the children to clean up any preexisting data
            childMatcher.resetChildIter();
        }
    }
}
