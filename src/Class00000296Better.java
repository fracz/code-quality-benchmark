// original filename: 00010148.txt
// after
public class Class00000296Better {
    private static HighlightInfo thisNotFoundInInterfaceInfo(PsiExpression expr) {
        return HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(expr).descriptionAndTooltip("Cannot find symbol variable this").create();
    }
}
