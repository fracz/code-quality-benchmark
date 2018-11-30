// original filename: 00047098.txt
// before
public class Class00000390Worse {
    public void addPublication(final DriverPublication publication) {
        publicationBySessionIdMap.getOrDefault(publication.sessionId(), Int2ObjectHashMap::new).put(publication.streamId(), publication);
    }
}
