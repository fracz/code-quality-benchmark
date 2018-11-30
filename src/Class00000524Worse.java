// original filename: 00031100.txt
// after
public class Class00000524Worse {
    /**
     * Sets the shard_size - indicating the number of term buckets each shard will return to the coordinating node (the
     * node that coordinates the search execution). The higher the shard size is, the more accurate the results are.
     */
    public TermsBuilder shardSize(int shardSize) {
        bucketCountThresholds.setShardSize(shardSize);
        return this;
    }
}
