// original filename: 00032597.txt
// before
public class Class00000228Worse {
    public static SuggestedFix swap(Position pos1, Position pos2) {
        return new SuggestedFix().replace(pos1.start, pos1.end, pos2.getSource()).replace(pos2.start, pos2.end, pos1.getSource());
    }
}
