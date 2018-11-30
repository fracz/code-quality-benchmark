// original filename: 00000891.txt
// after
public class Class00000325Better {
    public Color getBackgroundColor() {
        MTConfig config = MTConfig.getInstance();
        final MTTheme mtTheme = config.getSelectedTheme();
        return mtTheme.getBackgroundColor();
    }
}
