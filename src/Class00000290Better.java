// original filename: 00042815.txt
// after
public class Class00000290Better {
    /**
     * Returns the original value of a field before it has been changed.
     *
     * @param iPropertyName Property name to retrieve the original value
     */
    public Set<String> getDirtyFields() {
        return (Set<String>) (_fieldOriginalValues != null ? Collections.unmodifiableSet(_fieldOriginalValues.keySet()) : Collections.emptySet());
    }
}
