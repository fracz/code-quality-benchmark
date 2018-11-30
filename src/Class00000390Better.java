// original filename: 00047098.txt
// after
public class Class00000390Better {
    public void addPublication(final DriverPublication publication) {
        publicationByCompoundIdMap.put(publication.sessionId(), publication.streamId(), publication);
    }
}
