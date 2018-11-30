// original filename: 00054968.txt
// before
public class Class00000276Worse {
    public static boolean isBackEdge(BlockNode from, BlockNode to) {
        if (from.getCleanSuccessors().contains(to))
            // already checked
            return false;
        if (!from.getSuccessors().contains(to))
            // not even successor
            return false;
        return true;
    }
}
