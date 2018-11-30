// original filename: 00019505.txt
// before
public class Class00000253Worse {
    @Override
    public KeyframeAnimation<PointF> createAnimation() {
        if (!hasAnimation()) {
            return new StaticKeyframeAnimation<>(initialPoint);
        }
        KeyframeAnimation<PointF> animation = new PathKeyframeAnimation(duration, composition, keyTimes, animationPath, interpolators);
        animation.setStartDelay(delay);
        return animation;
    }
}
