// original filename: 00009988.txt
// after
public class Class00000252Better {
    public static HighlightInfo checkCannotInheritFromTypeParameter(final PsiClass superClass, final PsiJavaCodeReferenceElement toHighlight) {
        if (superClass instanceof PsiTypeParameter) {
            String description = JavaErrorMessages.message("class.cannot.inherit.from.its.type.parameter");
            return HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(toHighlight).descriptionAndTooltip(description).create();
        }
        return null;
    }
}
