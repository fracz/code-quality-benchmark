// original filename: 00039895.txt
// before
public class Class00000442Worse {
    private void resetIndexCounts(int labelId, int pkId) {
        try (CountsAccessor.IndexStatsUpdater updater = neoStores().getCounts().updateIndexCounts()) {
            updater.replaceIndexSample(labelId, pkId, 0, 0);
            updater.replaceIndexUpdateAndSize(labelId, pkId, 0, 0);
        }
    }
}
