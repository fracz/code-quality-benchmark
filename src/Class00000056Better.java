// original filename: 00004362.txt
// after
public class Class00000056Better {
    public String toString() {
        if (myEventSet != null) {
            return myEventSet.toString();
        }
        return myThread != null ? myThread.toString() : DebuggerBundle.message("string.null.context");
    }
}
