// original filename: 00009673.txt
// after
public class Class00000059Better {
    @Override
    public Icon scale(float scale) {
        if (scale == getScale())
            return this;
        setScale(scale);
        if (myScaledIcons != null)
            Arrays.fill(myScaledIcons, null);
        return this;
    }
}
