// original filename: 00050884.txt
// before
public class Class00000139Worse {
    /**
     * Attribute level. Zero based
     *
     * @return attribute level (depth)
     */
    public int getLevel() {
        if (parent == null) {
            return 0;
        }
        int level = 0;
        for (DBDAttributeBinding binding = parent; binding != null; binding = binding.parent) {
            level++;
        }
        return level;
    }
}
