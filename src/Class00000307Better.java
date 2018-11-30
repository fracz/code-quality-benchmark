// original filename: 00060320.txt
// after
public class Class00000307Better {
    public void setVisible(boolean visible, boolean animate) {
        if (visible && isHiding()) {
            show(animate);
        } else if (!visible && isShowing()) {
            hide(animate);
        }
    }
}
