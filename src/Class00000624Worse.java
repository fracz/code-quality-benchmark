// original filename: 00047167.txt
// after
public class Class00000624Worse {
    public DriverPublication findPublication(final int sessionId, final int streamId) {
        final PublicationComponents components = publicationByCompoundIdMap.get(sessionId, streamId);
        if (null != components) {
            return components.publication;
        }
        return null;
    }
}
