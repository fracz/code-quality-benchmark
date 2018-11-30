// original filename: 00029967.txt
// before
public class Class00000138Worse {
    @Override
    public void writeTo(DataOutput out) throws IOException {
        out.writeInt(indices.size());
        for (IndexRefreshResponse indexRefreshResponse : indices.values()) {
            indexRefreshResponse.writeTo(out);
        }
    }
}
