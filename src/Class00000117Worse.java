// original filename: 00035591.txt
// before
public class Class00000117Worse {
    public void setContourColorRes(@ColorRes int colorRes) {
        if (getDrawable() instanceof IconicsDrawable) {
            ((IconicsDrawable) getDrawable()).contourColorRes(colorRes);
        }
        mIconBundle.mContourColor = ContextCompat.getColor(getContext(), colorRes);
    }
}
