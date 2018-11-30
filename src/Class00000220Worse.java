// original filename: 00034370.txt
// before
public class Class00000220Worse {
    private void onCryptoFailed(OpenPgpError error) {
        OpenPgpResultAnnotation errorPart = new OpenPgpResultAnnotation();
        errorPart.setError(error);
        addOpenPgpResultPartToMessage(errorPart);
        onCryptoFinished();
    }
}
