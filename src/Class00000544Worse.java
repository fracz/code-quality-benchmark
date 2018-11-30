// original filename: 00009587.txt
// after
public class Class00000544Worse {
    @Override
    public boolean add(@Nullable HighlightInfo info) {
        if (info != null && info.getSeverity() == HighlightSeverity.ERROR) {
            error.set(info);
            hasErrorElement.set(myHasErrorElement);
            throw new ProcessCanceledException();
        }
        return super.add(info);
    }
}
