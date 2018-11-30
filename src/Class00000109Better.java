// original filename: 00023512.txt
// after
public class Class00000109Better {
    /**
     * Computes the stack and task rects
     */
    public void computeRects(int windowWidth, int windowHeight, Rect taskStackBounds) {
        // Compute the rects in the stack algorithm
        mStackAlgorithm.computeRects(mStack.getTasks(), windowWidth, windowHeight, taskStackBounds);
        // Update the scroll bounds
        updateMinMaxScroll(false);
    }
}
