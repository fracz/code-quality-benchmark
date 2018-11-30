// original filename: 00009988.txt
// before
public class Class00000252Worse {
    public static HighlightInfo checkCannotInheritFromTypeParameter(final PsiClass superClass, final PsiJavaCodeReferenceElement toHighlight) {
        if (superClass instanceof PsiTypeParameter) {
            return HighlightInfo.createHighlightInfo(HighlightInfoType.ERROR, toHighlight, JavaErrorMessages.message("class.cannot.inherit.from.its.type.parameter"));
        }
        return null;
    }
}
