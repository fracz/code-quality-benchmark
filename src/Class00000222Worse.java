// original filename: 00001841.txt
// before
public class Class00000222Worse {
    private static void doTest(List<TimedVcsCommit> started, List<TimedVcsCommit> expected) {
        List<TimedVcsCommit> sorted = new VcsLogSorter<TimedVcsCommit>().sortByDateTopoOrder(started);
        assertEquals(toStr(expected), toStr(sorted));
    }
}
