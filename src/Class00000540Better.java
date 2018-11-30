// original filename: 00056645.txt
// before
public class Class00000540Better {
    @Override
    void resetChildIter() {
        decommitVariableGroups();
        removeNamedNodes();
        // lazy initialization saves quite a bit of time in use cases
        // where we call something other than matches()
        treeNodeMatchCandidateIterator = null;
        finished = false;
        nextTreeNodeMatchCandidate = null;
        if (childMatcher != null) {
            // need to tell the children to clean up any preexisting data
            childMatcher.resetChildIter();
        }
    }
}
