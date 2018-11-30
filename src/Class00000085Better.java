// original filename: 00035274.txt
// after
public class Class00000085Better {
    public void setStyle(SliderStyle style) {
        if (style == null)
            throw new IllegalArgumentException("style cannot be null.");
        this.style = style;
        invalidateHierarchy();
    }
}
