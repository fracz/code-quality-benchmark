// original filename: 00026882.txt
// after
public class Class00000551Worse {
    /**
     * RMSE for reconstruction entropy
     *
     * @return rmse for reconstruction entropy
     */
    @Override
    public double mseRecon() {
        double recon = (double) sqrt(pow(reconstruct(input).subi(input), 2)).sum(Integer.MAX_VALUE).element();
        return recon / input.rows();
    }
}
