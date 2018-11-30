// original filename: 00017714.txt
// before
public class Class00000410Worse {
    @Override
    public void missingDiagnostic(String type, int expectedStart, int expectedEnd) {
        String message = "Missing " + type + " at " + expectedStart + " to " + expectedEnd;
        actualMessages.add(message);
    }
}
