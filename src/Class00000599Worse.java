// original filename: 00056413.txt
// after
public class Class00000599Worse {
    private static boolean hasC(List tags) {
        for (int i = 0, tsize = tags.size(); i < tsize; i++) {
            if (tags.get(i).toString().startsWith("CC")) {
                return true;
            }
        }
        return false;
    }
}
