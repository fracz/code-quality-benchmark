// original filename: 00009587.txt
// before
public class Class00000544Better {
    @Override
    public boolean add(@Nullable HighlightInfo info) {
        if (info != null && info.getSeverity() == HighlightSeverity.ERROR) {
            throw new HaveGotErrorException(info, myHasErrorElement);
        }
        return super.add(info);
    }
}
