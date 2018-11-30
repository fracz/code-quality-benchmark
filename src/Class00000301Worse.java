// original filename: 00035599.txt
// before
public class Class00000301Worse {
    public void setRoundedCornersPx(int cornerRadius) {
        if (getDrawable() instanceof IconicsDrawable) {
            ((IconicsDrawable) getDrawable()).roundedCornersDp(cornerRadius);
        }
        mIconBundle.mCornerRadius = cornerRadius;
    }
}
