// original filename: 00039942.txt
// after
public class Class00000035Better {
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
     * For value format, see {@link org.neo4j.kernel.impl.store.counts.CountsUpdater#replaceIndexUpdateAndSize(IndexDescriptor, long, long)}.
     */
    @Override
    public void visitIndexStatistics(IndexDescriptor descriptor, long updates, long size) {
        indexKey(INDEX_STATS, descriptor);
    }
}
