// original filename: 00009674.txt
// before
public class Class00000345Worse {
    @Override
    public Icon scale(float scale) {
        if (scale == 1f)
            return this;
        setScale(scaleVal(scale, Scale.ARBITRARY));
        rescale();
        return this;
    }
}
