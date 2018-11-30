// original filename: 00039941.txt
// before
public class Class00000128Worse {
    /**
     * Key format:
     * <pre>
     * 0 1 2 3 4 5 6 7   8 9 A B C D E F
     * [t,0,0,0,l,l,l,l ; p,p,p,p,0,0,0,k]
     * t - index entry marker - "{@link #INDEX}"
     * k - entry (sub)type - "{@link #INDEX_SAMPLE}"
     * l - label id
     * p - property key id
     * </pre>
     * For value format, see {@link org.neo4j.kernel.impl.store.counts.CountsUpdater#replaceIndexSample(int, int, long, long)}.
     */
    @Override
    public void visitIndexSample(int labelId, int propertyKeyId, long unique, long size) {
        indexKey(INDEX_SAMPLE, labelId, propertyKeyId);
    }
}
