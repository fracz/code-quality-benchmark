// original filename: 00000891.txt
// before
public class Class00000325Worse {
    public Color getBackgroundColor() {
        Properties properties = getProperties();
        return ColorUtil.fromHex("#" + properties.getProperty("material.tab.backgroundColor"));
    }
}
