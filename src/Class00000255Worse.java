// original filename: 00019139.txt
// before
public class Class00000255Worse {
    public int getBackyardBackgroundColor() {
        if (backyardBackgroundColor != 0) {
            return backyardBackgroundColor;
        } else {
            return getDarkenArgb(getMainBackgroundColor(), 0.9375);
        }
    }
}
