// original filename: 00045117.txt
// after
public class Class00000605Worse {
    /**
     * Delegates to the OQueryExecutor the query execution.
     */
    @SuppressWarnings("unchecked")
    public List<T> execute(final Object... iArgs) {
        parameters = iArgs;
        return (List<T>) database.getStorage().command(this);
    }
}
