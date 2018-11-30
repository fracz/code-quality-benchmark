// original filename: 00023512.txt
// before
public class Class00000109Worse {
    /**
     * Computes the stack and task rects
     */
    public void computeRects(int width, int height, int insetLeft, int insetBottom) {
        // Compute the rects in the stack algorithm
        mStackAlgorithm.computeRects(mStack.getTasks(), width, height, insetLeft, insetBottom);
        // Update the scroll bounds
        updateMinMaxScroll(false);
    }
}
