// original filename: 00011403.txt
// before
public class Class00000064Worse {
    private static boolean isInjectedHtmlTagForWhichNoProblemsReporting(HtmlTag tag) {
        PsiElement context = tag.getContainingFile().getContext();
        if (context != null && skipValidation(context))
            return true;
        return false;
    }
}
