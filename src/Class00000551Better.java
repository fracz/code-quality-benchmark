// original filename: 00026882.txt
// before
public class Class00000551Better {
    /**
     * RMSE for reconstruction entropy
     *
     * @return rmse for reconstruction entropy
     */
    @Override
    public double mseRecon() {
        return sqrt(pow(reconstruct(input).sub(input), 2)).sum() / input.rows;
    }
}
