// original filename: 00057864.txt
// after
public class Class00000634Worse {
    public Set<Requirement> requires() {
        if (annotators.size() == 0) {
            return Collections.emptySet();
        }
        return annotators.get(0).requires();
    }
}
