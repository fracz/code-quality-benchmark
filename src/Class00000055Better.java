// original filename: 00037471.txt
// after
public class Class00000055Better {
    public AnnotationKeyMatcherRegistry build() {
        IntHashMap<AnnotationKeyMatcher> copy = IntHashMapUtils.copy(buildMap);
        return new AnnotationKeyMatcherRegistry(copy);
    }
}
