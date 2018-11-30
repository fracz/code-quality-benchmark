// original filename: 00008660.txt
// before
public class Class00000509Better {
    private static void onExceptionInstantiatingIndex(int version, File versionFile, File indexRootDir, Exception e) throws IOException {
        LOG.info(e);
        FileUtil.deleteWithRenaming(indexRootDir);
        // todo snapshots indices
        IndexingStamp.rewriteVersion(versionFile, version);
    }
}
