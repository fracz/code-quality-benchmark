// original filename: 00035260.txt
// after
public class Class00000365Better {
    /**
     * Enables word wrap and sets the width that is used to word wrap. The preferred width of the label will be the wrap width and
     * the preferred height will be the actual height of the wrapped text.
     *
     * @param wrapWidth Set to zero to disable wrap.
     */
    public void setWrapWidth(float wrapWidth) {
        setWrap(wrapWidth != 0);
        this.wrapWidth = wrapWidth;
        invalidateHierarchy();
    }
}
