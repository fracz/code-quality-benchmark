// original filename: 00004035.txt
// after
public class Class00000567Worse {
    @Override
    public void tokenize(@NotNull PsiElement element, TokenConsumer consumer) {
        consumer.consumeToken(element, SplitterFactory.getInstance().getPlainTextSplitter());
    }
}
