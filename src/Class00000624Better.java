// original filename: 00047167.txt
// before
public class Class00000624Better {
    public DriverPublication findPublication(final int sessionId, final int streamId) {
        return publicationByCompoundIdMap.get(sessionId, streamId);
    }
}
