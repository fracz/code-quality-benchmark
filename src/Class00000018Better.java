// original filename: 00031053.txt
// after
public class Class00000018Better {
    @Override
    public float score(int docId, float subQueryScore) {
        script.setNextDocId(docId);
        script.setNextScore(subQueryScore);
        return script.runAsFloat();
    }
}
