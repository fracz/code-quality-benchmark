// original filename: 00019505.txt
// after
public class Class00000253Better {
    @Override
    public BaseKeyframeAnimation<?, PointF> createAnimation() {
        if (!hasAnimation()) {
            return new StaticKeyframeAnimation<>(initialPoint);
        }
        return new PathKeyframeAnimation(keyframes);
    }
}
