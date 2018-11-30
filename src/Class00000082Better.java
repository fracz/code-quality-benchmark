// original filename: 00033914.txt
// after
public class Class00000082Better {
    private List<Header> grpcResponseTrailers() {
        return ImmutableList.of(new Header(Status.CODE_KEY.name(), "0"), // Adding Content-Type for testing responses with only a single HEADERS frame.
                CONTENT_TYPE_HEADER);
    }
}
