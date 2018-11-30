// original filename: 00033986.txt
// before
public class Class00000360Worse {
    /**
     * Returns the singular value decomposition.
     */
    public SingularValueDecomposition svd() {
        if (svd != null) {
            double[][] V = array();
            svd = SingularValueDecomposition.decompose(V);
            rank = svd.rank();
        }
        return svd;
    }
}
