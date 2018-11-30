// original filename: 00019507.txt
// after
public class Class00000198Better {
    @Override
    public KeyframeAnimation<PointF> createAnimation() {
        if (!hasAnimation()) {
            return new StaticKeyframeAnimation<>(initialValue);
        }
        return new PointKeyframeAnimation(keyframes);
    }
}
