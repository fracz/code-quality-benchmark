// original filename: 00055406.txt
// before
public class Class00000380Worse {
    /**
     * Assert the response status code is in the 1xx range.
     */
    public WebTestClient.ResponseSpec is1xxInformational() {
        String message = "Range for response status value " + this.httpStatus;
        assertEquals(message, HttpStatus.Series.INFORMATIONAL, this.httpStatus.series());
        return this.responseSpec;
    }
}
