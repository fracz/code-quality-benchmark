// original filename: 00011403.txt
// after
public class Class00000064Better {
    private static boolean isInjectedHtmlTagForWhichNoProblemsReporting(HtmlTag tag) {
        PsiElement context = tag.getContainingFile().getContext();
        return context != null && skipValidation(context);
    }
}
