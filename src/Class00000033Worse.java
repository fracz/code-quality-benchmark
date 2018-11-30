// original filename: 00024564.txt
// before
public class Class00000033Worse {
    @Override
    public List<ByteBuffer> values(QueryOptions options) throws InvalidRequestException {
        return Composites.toByteBuffers(valuesAsComposites(options));
    }
}
