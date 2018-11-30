// original filename: 00056413.txt
// before
public class Class00000599Better {
    private static boolean hasC(List<Label> tags) {
        for (Label tag : tags) {
            if (tag.toString().startsWith("CC")) {
                return true;
            }
        }
        return false;
    }
}
