// original filename: 00035594.txt
// before
public class Class00000070Worse {
    public void setContourWidthRes(@DimenRes int contourWidthRes) {
        if (getDrawable() instanceof IconicsDrawable) {
            ((IconicsDrawable) getDrawable()).contourWidthRes(contourWidthRes);
        }
        mIconBundle.mContourWidth = getContext().getResources().getDimensionPixelSize(contourWidthRes);
    }
}
