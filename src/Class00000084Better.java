// original filename: 00028265.txt
// after
public class Class00000084Better {
    /**
     * Sets the active {@link RecordDecoderFactory} to be used for decoding
     * resource records.
     *
     * @param factory the {@link RecordDecoderFactory} to use
     */
    public static void setFactory(RecordDecoderFactory factory) {
        Objects.requireNonNull(factory, "Cannot set record decoder factory to null.");
        RecordDecoderFactory.factory = factory;
    }
}
