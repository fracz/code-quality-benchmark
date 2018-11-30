// original filename: 00051031.txt
// before
public class Class00000498Better {
    private boolean isLineDelimiter(IDocument document, String text) {
        String[] delimiters = document.getLegalLineDelimiters();
        return delimiters != null && TextUtilities.equals(delimiters, text) > -1;
    }
}
