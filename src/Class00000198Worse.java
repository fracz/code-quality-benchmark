// original filename: 00019507.txt
// before
public class Class00000198Worse {
    @Override
    public KeyframeAnimation<PointF> createAnimation() {
        if (!hasAnimation()) {
            return new StaticKeyframeAnimation<>(initialValue);
        }
        KeyframeAnimation<PointF> animation = new PointKeyframeAnimation(duration, composition, keyTimes, keyValues, interpolators);
        animation.setStartDelay(delay);
        return animation;
    }
}
