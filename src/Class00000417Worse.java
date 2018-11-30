// original filename: 00035596.txt
// before
public class Class00000417Worse {
    public void setPaddingPx(int padding) {
        if (getDrawable() instanceof IconicsDrawable) {
            ((IconicsDrawable) getDrawable()).paddingPx(padding);
        }
        mIconBundle.mPadding = padding;
    }
}
