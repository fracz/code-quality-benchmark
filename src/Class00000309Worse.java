// original filename: 00030083.txt
// before
public class Class00000309Worse {
    public void close() {
        cache.remove();
        rootObjectMapper.close();
        idFieldMapper.close();
        indexFieldMapper.close();
        typeFieldMapper.close();
        allFieldMapper.close();
        analyzerMapper.close();
        sourceFieldMapper.close();
        sizeFieldMapper.close();
    }
}
