// original filename: 00044773.txt
// before
public class Class00000188Worse {
    public Analyzer queryAnalyzer() {
        return storage.callIndexEngine(false, false, indexId, new OIndexEngineCallback<Analyzer>() {

            @Override
            public Analyzer callEngine(OIndexEngine engine) {
                OLuceneIndexEngine indexEngine = (OLuceneIndexEngine) engine;
                return indexEngine.queryAnalyzer();
            }
        });
    }
}
