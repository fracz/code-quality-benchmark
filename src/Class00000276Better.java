// original filename: 00054968.txt
// after
public class Class00000276Better {
    public static boolean isBackEdge(BlockNode from, BlockNode to) {
        if (from.getCleanSuccessors().contains(to))
            // already checked
            return false;
        return from.getSuccessors().contains(to);
    }
}
