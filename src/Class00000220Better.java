// original filename: 00034370.txt
// after
public class Class00000220Better {
    private void onCryptoFailed(OpenPgpError error) {
        CryptoResultAnnotation errorPart = CryptoResultAnnotation.createOpenPgpErrorAnnotation(error);
        addCryptoResultAnnotationToMessage(errorPart);
        onCryptoFinished();
    }
}
