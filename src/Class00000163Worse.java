// original filename: 00019678.txt
// before
public class Class00000163Worse {
    public void setMaxIdle(int maxIdle) {
        if (inited) {
            throw new UnsupportedOperationException();
        }
        this.maxIdle = maxIdle;
    }
}
