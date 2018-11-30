// original filename: 00033986.txt
// after
public class Class00000360Better {
    /**
     * Returns the singular value decomposition.
     */
    public SingularValueDecomposition svd() {
        if (svd != null) {
            svd = new SingularValueDecomposition(this);
            rank = svd.rank();
        }
        return svd;
    }
}
