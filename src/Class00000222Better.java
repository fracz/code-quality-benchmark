// original filename: 00001841.txt
// after
public class Class00000222Better {
    private static void doTest(List<TimedVcsCommit> started, List<TimedVcsCommit> expected) {
        List<TimedVcsCommit> sorted = VcsLogSorter.sortByDateTopoOrder(started);
        assertEquals(toStr(expected), toStr(sorted));
    }
}
