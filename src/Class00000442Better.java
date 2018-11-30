// original filename: 00039895.txt
// after
public class Class00000442Better {
    private void resetIndexCounts(IndexDescriptor index) {
        try (CountsAccessor.IndexStatsUpdater updater = neoStores().getCounts().updateIndexCounts()) {
            updater.replaceIndexSample(index, 0, 0);
            updater.replaceIndexUpdateAndSize(index, 0, 0);
        }
    }
}
