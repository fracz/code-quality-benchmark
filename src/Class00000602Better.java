// original filename: 00009161.txt
// before
public class Class00000602Better {
    public Collection<TextRange> getRangesToFormat(@NotNull PsiFile file) {
        Collection<TextRange> ranges = getSelectedRanges(mySelectionModel);
        if (ranges.isEmpty()) {
            return ContainerUtil.newSmartList(file.getTextRange());
        }
        return ranges;
    }
}
