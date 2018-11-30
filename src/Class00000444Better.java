// original filename: 00034092.txt
// after
public class Class00000444Better {
    /*
     * Download the file at DEFAULT_URL and when that promise is fulfilled,
     * then promise to apply function to calculate character frequency.
     */
    private Promise<Map<Character, Integer>> characterFrequency() {
        return download(DEFAULT_URL).thenApply(Utility::characterFrequency);
    }
}
