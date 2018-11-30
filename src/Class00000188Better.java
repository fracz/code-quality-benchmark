// original filename: 00044773.txt
// after
public class Class00000188Better {
    public Analyzer queryAnalyzer() {
        return storage.callIndexEngine(false, false, indexId, engine -> {
            OLuceneIndexEngine indexEngine = (OLuceneIndexEngine) engine;
            return indexEngine.queryAnalyzer();
        });
    }
}
