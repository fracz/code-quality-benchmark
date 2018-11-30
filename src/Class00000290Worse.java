// original filename: 00042815.txt
// before
public class Class00000290Worse {
    /**
     * Returns the original value of a field before it has been changed.
     *
     * @param iPropertyName Property name to retrieve the original value
     */
    public Set<String> getDirtyFields() {
        return _fieldOriginalValues != null ? Collections.unmodifiableSet(_fieldOriginalValues.keySet()) : null;
    }
}
