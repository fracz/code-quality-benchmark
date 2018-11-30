// original filename: 00004362.txt
// before
public class Class00000056Worse {
    public String toString() {
        if (myEventSet != null) {
            return myEventSet.toString();
        } else {
            return myThread != null ? myThread.toString() : DebuggerBundle.message("string.null.context");
        }
    }
}
