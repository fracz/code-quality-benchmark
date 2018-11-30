// original filename: 00035594.txt
// after
public class Class00000070Better {
    public void setContourWidthRes(@DimenRes int contourWidthRes) {
        mIconBundle.mContourWidth = getContext().getResources().getDimensionPixelSize(contourWidthRes);
        mIconBundle.applyProperties();
    }
}
