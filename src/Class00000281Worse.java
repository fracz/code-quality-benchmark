// original filename: 00008263.txt
// before
public class Class00000281Worse {
    public void setCurrentElementType(@Nullable IElementType type) {
        myMarkers.push(new Pair<PsiBuilder.Marker, IElementType>(myMarkers.pop().first, type));
    }
}
