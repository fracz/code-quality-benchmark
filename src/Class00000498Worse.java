// original filename: 00051031.txt
// after
public class Class00000498Worse {
    private boolean isLineDelimiter(IDocument document, String text) {
        if (delimiters == null) {
            delimiters = document.getLegalLineDelimiters();
        }
        return delimiters != null && TextUtilities.equals(delimiters, text) > -1;
    }
}
