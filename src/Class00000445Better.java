// original filename: 00009965.txt
// after
public class Class00000445Better {
    public static HighlightInfo checkFunctionalInterface(PsiAnnotation annotation) {
        final String errorMessage = LambdaUtil.checkFunctionalInterface(annotation);
        if (errorMessage != null) {
            return HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(annotation).descriptionAndTooltip(errorMessage).create();
        }
        return null;
    }
}
