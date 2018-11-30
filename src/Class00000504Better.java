// original filename: 00046967.txt
// before
public class Class00000504Better {
    @Test
    public void releasingPublicationShouldNotifyMediaDriver() throws Exception {
        Publication publication = addPublication();
        willNotifyOperationSucceeded();
        publication.release();
        verifyBuffersReleased(SESSION_ID_1);
        verify(driverProxy).removePublication(DESTINATION, SESSION_ID_1, CHANNEL_ID_1);
    }
}
