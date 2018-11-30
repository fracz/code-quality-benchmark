// original filename: 00057864.txt
// before
public class Class00000634Better {
    @Override
    public Set<Requirement> requires() {
        if (annotators.isEmpty()) {
            return Collections.emptySet();
        }
        return annotators.get(0).requires();
    }
}
