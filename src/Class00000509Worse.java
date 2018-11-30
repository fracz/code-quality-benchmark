// original filename: 00008660.txt
// after
public class Class00000509Worse {
    private static <K> void onExceptionInstantiatingIndex(StubIndexKey<K, ?> indexKey, int version, File indexRootDir, Exception e) throws IOException {
        LOG.info(e);
        FileUtil.deleteWithRenaming(indexRootDir);
        // todo snapshots indices
        IndexingStamp.rewriteVersion(indexKey, version);
    }
}
