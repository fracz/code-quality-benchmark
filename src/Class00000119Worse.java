// original filename: 00040414.txt
// before
public class Class00000119Worse {
    /**
     * Clear disc cache
     */
    public void clearDiscCache() {
        File[] files = cacheDir.listFiles();
        for (File f : files) {
            f.delete();
        }
    }
}
