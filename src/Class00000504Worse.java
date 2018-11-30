// original filename: 00046967.txt
// after
public class Class00000504Worse {
    @Test
    public void releasingPublicationShouldNotifyMediaDriver() throws Exception {
        Publication publication = addPublication();
        willNotifyOperationSucceeded();
        publication.release();
        // TODO: do these verifies as part of a publication test.
        // verifyBuffersReleased(SESSION_ID_1);
        verify(driverProxy).removePublication(DESTINATION, SESSION_ID_1, CHANNEL_ID_1);
    }
}
