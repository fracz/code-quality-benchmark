// original filename: 00024564.txt
// after
public class Class00000033Better {
    @Override
    public List<ByteBuffer> values(QueryOptions options) throws InvalidRequestException {
        if (!isPartitionKey)
            throw new UnsupportedOperationException();
        return toByteBuffers(valuesAsClustering(options));
    }
}
