// original filename: 00039942.txt
// before
public class Class00000035Worse {
    /**
     * Key format:
     * <pre>
     * 0 1 2 3 4 5 6 7   8 9 A B C D E F
     * [t,0,0,0,l,l,l,l ; p,p,p,p,0,0,0,k]
     * t - index entry marker - "{@link #INDEX}"
     * k - entry (sub)type - "{@link #INDEX_STATS}"
     * l - label id
     * p - property key id
     * </pre>
     * For value format, see {@link org.neo4j.kernel.impl.store.counts.CountsUpdater#replaceIndexUpdateAndSize(int, int, long, long)}.
     */
    @Override
    public void visitIndexStatistics(int labelId, int propertyKeyId, long updates, long size) {
        indexKey(INDEX_STATS, labelId, propertyKeyId);
    }
}
