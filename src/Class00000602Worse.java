// original filename: 00009161.txt
// after
public class Class00000602Worse {
    public Collection<TextRange> getRangesToFormat(@NotNull PsiFile file, boolean processChangedTextOnly) throws FilesTooBigForDiffException {
        if (mySelectionModel != null) {
            return getSelectedRanges(mySelectionModel);
        }
        if (processChangedTextOnly) {
            return FormatChangedTextUtil.getChangedTextRanges(myProject, file);
        }
        return ContainerUtil.newSmartList(file.getTextRange());
    }
}
