// original filename: 00050884.txt
// after
public class Class00000139Better {
    /**
     * Attribute level. Zero based
     *
     * @return attribute level (depth)
     */
    public int getLevel() {
        if (getParentObject() == null) {
            return 0;
        }
        int level = 0;
        for (DBDAttributeBinding binding = getParentObject(); binding != null; binding = binding.getParentObject()) {
            level++;
        }
        return level;
    }
}
