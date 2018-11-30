// original filename: 00031053.txt
// before
public class Class00000018Worse {
    @Override
    public float score(int docId, float subQueryScore) {
        vars.put("_score", subQueryScore);
        return ((Number) script.execute(docId, vars)).floatValue();
    }
}
