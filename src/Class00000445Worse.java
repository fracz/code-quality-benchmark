// original filename: 00009965.txt
// before
public class Class00000445Worse {
    public static HighlightInfo checkFunctionalInterface(PsiAnnotation annotation) {
        final String errorMessage = LambdaUtil.checkFunctionalInterface(annotation);
        if (errorMessage != null) {
            return HighlightInfo.createHighlightInfo(HighlightInfoType.ERROR, annotation, errorMessage);
        }
        return null;
    }
}
