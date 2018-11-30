// original filename: 00030160.txt
// after
public class Class00000512Worse {
    @Override
    protected void shardOperationOnReplica(ShardId shardId, Request request) {
        request.processedOnReplicas.incrementAndGet();
    }
}
