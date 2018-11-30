// original filename: 00030657.txt
// after
public class Class00000019Better {
    @Override
    public final void writeTo(StreamOutput out) throws IOException {
        doWriteTo(out);
        out.writeFloat(boost);
        out.writeOptionalString(queryName);
    }
}
