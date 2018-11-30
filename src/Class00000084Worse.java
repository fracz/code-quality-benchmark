// original filename: 00028265.txt
// before
public class Class00000084Worse {
    /**
     * Sets the active {@link RecordDecoderFactory} to be used for decoding
     * resource records.
     *
     * @param factory the {@link RecordDecoderFactory} to use
     */
    public static void setFactory(RecordDecoderFactory factory) {
        if (factory == null) {
            throw new NullPointerException("Cannot set record decoder factory to null.");
        }
        RecordDecoderFactory.factory = factory;
    }
}
