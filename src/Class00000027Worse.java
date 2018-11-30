// original filename: 00006286.txt
// before
public class Class00000027Worse {
    public boolean isToolEnabled(HighlightDisplayKey key) {
        if (key == null)
            return false;
        return myAvailableTools.containsKey(key.toString());
    }
}
