// original filename: 00060320.txt
// before
public class Class00000307Worse {
    public void setVisible(boolean visible, boolean animate) {
        if (isShowing() && !visible) {
            hide(animate);
        } else if (isHiding() && visible) {
            show(animate);
        }
    }
}
