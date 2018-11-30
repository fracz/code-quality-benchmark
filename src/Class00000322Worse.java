// original filename: 00023260.txt
// before
public class Class00000322Worse {
    public float getHeight() {
        int height = mView.getLayoutParams().height;
        if (height < 0) {
            height = mView.getMeasuredHeight();
        }
        return height;
    }
}
