// original filename: 00009674.txt
// after
public class Class00000345Better {
    @Override
    public Icon scale(float scale) {
        if (scale == getScale())
            return this;
        setScale(scale);
        rescale();
        return this;
    }
}
