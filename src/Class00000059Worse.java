// original filename: 00009673.txt
// before
public class Class00000059Worse {
    @Override
    public Icon scale(float scale) {
        if (scale == 1f)
            return this;
        setScale(scaleVal(scale, Scale.ARBITRARY));
        if (myScaledIcons != null)
            Arrays.fill(myScaledIcons, null);
        return this;
    }
}
