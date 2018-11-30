// original filename: 00004035.txt
// before
public class Class00000567Better {
    @Override
    public Token[] tokenize(@NotNull PsiElement element) {
        return new Token[]{new Token<PsiElement>(element, element.getText(), false, SplitterFactory.getInstance().getPlainTextSplitter())};
    }
}
