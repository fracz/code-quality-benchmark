// original filename: 00021863.txt
// before
public class Class00000131Worse {
    @Override
    protected int computeHorizontalScrollRange() {
        if (mDrawHistory) {
            return mHistoryWidth;
        } else if (mHorizontalScrollBarMode == SCROLLBAR_ALWAYSOFF && (mActualScale - mZoomManager.mMinZoomScale <= MINIMUM_SCALE_INCREMENT)) {
            // only honor the scrollbar mode when it is at minimum zoom level
            return computeHorizontalScrollExtent();
        } else {
            // to avoid rounding error caused unnecessary scrollbar, use floor
            return (int) Math.floor(mContentWidth * mActualScale);
        }
    }
}
