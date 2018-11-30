// original filename: 00013259.txt
// before
public class Class00000385Worse {
    @Override
    @NotNull
    public TextChunk[] getText() {
        final TextChunk[] chunks = usagePresentation.getText();
        return ArrayUtil.append(chunks, new TextChunk(SimpleTextAttributes.GRAY_ITALIC_ATTRIBUTES.toTextAttributes(), conflictDescription));
    }
}
