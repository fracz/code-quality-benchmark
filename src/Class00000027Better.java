// original filename: 00006286.txt
// after
public class Class00000027Better {
    public boolean isToolEnabled(HighlightDisplayKey key) {
        return key != null && myAvailableTools.containsKey(key.toString());
    }
}
