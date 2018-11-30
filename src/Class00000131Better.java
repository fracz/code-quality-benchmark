// original filename: 00021863.txt
// after
public class Class00000131Better {
    @Override
    protected int computeHorizontalScrollRange() {
        if (mDrawHistory) {
            return mHistoryWidth;
        } else if (mHorizontalScrollBarMode == SCROLLBAR_ALWAYSOFF && mZoomManager.isZoomedOut()) {
            // only honor the scrollbar mode when it is at minimum zoom level
            return computeHorizontalScrollExtent();
        } else {
            // to avoid rounding error caused unnecessary scrollbar, use floor
            return (int) Math.floor(mContentWidth * mZoomManager.mActualScale);
        }
    }
}
