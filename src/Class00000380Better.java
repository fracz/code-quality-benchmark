// original filename: 00055406.txt
// after
public class Class00000380Better {
    /**
     * Assert the response status code is in the 1xx range.
     */
    public WebTestClient.ResponseSpec is1xxInformational() {
        String message = "Range for response status value " + getStatus();
        assertEquals(message, HttpStatus.Series.INFORMATIONAL, getStatus().series());
        return this.responseSpec;
    }
}
